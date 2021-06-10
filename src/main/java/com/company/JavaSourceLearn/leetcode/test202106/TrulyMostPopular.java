package com.company.JavaSourceLearn.leetcode.test202106;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @Author: liwenbo
 * @Date: 2021年06月07日
 * @Description: leetCode @ 面试题 17.07. 婴儿名字
 */
public class TrulyMostPopular {

    public static void main(String[] args) {
        TrulyMostPopular t = new TrulyMostPopular();
        String[] names = {"Fcclu(70)", "Ommjh(63)", "Dnsay(60)", "Qbmk(45)", "Unsb(26)", "Gauuk(75)", "Wzyyim(34)",
                "Bnea(55)", "Kri(71)", "Qnaakk(76)", "Gnplfi(68)", "Hfp(97)", "Qoi(70)", "Ijveol(46)", "Iidh(64)",
                "Qiy(26)", "Mcnef(59)", "Hvueqc(91)", "Obcbxb(54)", "Dhe(79)", "Jfq(26)", "Uwjsu(41)", "Wfmspz(39)",
                "Ebov(96)", "Ofl(72)", "Uvkdpn(71)", "Avcp(41)", "Msyr(9)", "Pgfpma(95)", "Vbp(89)", "Koaak(53)",
                "Qyqifg(85)", "Dwayf(97)", "Oltadg(95)", "Mwwvj(70)", "Uxf(74)", "Qvjp(6)", "Grqrg(81)", "Naf(3)",
                "Xjjol(62)", "Ibink(32)", "Qxabri(41)", "Ucqh(51)", "Mtz(72)", "Aeax(82)", "Kxutz(5)", "Qweye(15)",
                "Ard(82)", "Chycnm(4)", "Hcvcgc(97)", "Knpuq(61)", "Yeekgc(11)", "Ntfr(70)", "Lucf(62)", "Uhsg(23)",
                "Csh(39)", "Txixz(87)", "Kgabb(80)", "Weusps(79)", "Nuq(61)", "Drzsnw(87)", "Xxmsn(98)", "Onnev(77)",
                "Owh(64)", "Fpaf(46)", "Hvia(6)", "Kufa(95)", "Chhmx(66)", "Avmzs(39)", "Okwuq(96)", "Hrschk(30)",
                "Ffwni(67)", "Wpagta(25)", "Npilye(14)", "Axwtno(57)", "Qxkjt(31)", "Dwifi(51)", "Kasgmw(95)", "Vgxj(11)",
                "Nsgbth(26)", "Nzaz(51)", "Owk(87)", "Yjc(94)", "Hljt(21)", "Jvqg(47)", "Alrksy(69)", "Tlv(95)",
                "Acohsf(86)", "Qejo(60)", "Gbclj(20)", "Nekuam(17)", "Meutux(64)", "Tuvzkd(85)", "Fvkhz(98)",
                "Rngl(12)", "Gbkq(77)", "Uzgx(65)", "Ghc(15)", "Qsc(48)", "Siv(47)"};
        String[] synonyms = {"(Gnplfi,Qxabri)", "(Uzgx,Siv)", "(Bnea,Lucf)", "(Qnaakk,Msyr)",
                "(Grqrg,Gbclj)", "(Uhsg,Qejo)", "(Csh,Wpagta)", "(Xjjol,Lucf)", "(Qoi,Obcbxb)",
                "(Npilye,Vgxj)", "(Aeax,Ghc)", "(Txixz,Ffwni)", "(Qweye,Qsc)", "(Kri,Tuvzkd)", "(Ommjh,Vbp)",
                "(Pgfpma,Xxmsn)", "(Uhsg,Csh)", "(Qvjp,Kxutz)", "(Qxkjt,Tlv)", "(Wfmspz,Owk)", "(Dwayf,Chycnm)",
                "(Iidh,Qvjp)", "(Dnsay,Rngl)", "(Qweye,Tlv)", "(Wzyyim,Kxutz)", "(Hvueqc,Qejo)", "(Tlv,Ghc)", "(Hvia,Fvkhz)",
                "(Msyr,Owk)", "(Hrschk,Hljt)", "(Owh,Gbclj)", "(Dwifi,Uzgx)", "(Iidh,Fpaf)", "(Iidh,Meutux)", "(Txixz,Ghc)",
                "(Gbclj,Qsc)", "(Kgabb,Tuvzkd)", "(Uwjsu,Grqrg)", "(Vbp,Dwayf)", "(Xxmsn,Chhmx)", "(Uxf,Uzgx)"};
        String[] strings = t.trulyMostPopular(names, synonyms);
        System.out.println(Arrays.toString(strings));
    }

    /**
     * 输入：names = ["John(15)","Jon(12)","Chris(13)","Kris(4)","Christopher(19)"], synonyms = ["(Jon,John)","(John,Johnny)","(Chris,Kris)","(Chris,Christopher)"]
     * 输出：["John(27)","Chris(36)"]
     *
     * @param names
     * @param synonyms
     * @return
     */
    public String[] trulyMostPopular(String[] names, String[] synonyms) {
        // 创建 Pattern 对象
        Pattern result1 = Pattern.compile("(\\w*)\\((\\d*)\\)");
        Map<String, Integer> nameMap = Arrays.stream(names).reduce(new HashMap<>(), (h1, k) -> {
            Matcher matcher = result1.matcher(k);
            if (matcher.find()) h1.put(matcher.group(1), Integer.parseInt(matcher.group(2)));
            return h1;
        }, (k1, k2) -> k1);
        // John 15 Jon 12 Chris 13 Kris 4 Christopher 19

        Pattern result2 = Pattern.compile("\\((\\w*),(\\w*)\\)");
        Map<String, String> synonymsMap = Arrays.stream(synonyms).reduce(new HashMap<>(), (h1, k) -> {
            Matcher matcher = result2.matcher(k);
            if (matcher.find()) {
                String key1 = matcher.group(1);
                String key2 = matcher.group(2);
                if (compare(key1, key2) > 0) {
                    if (h1.containsKey(key1)) {
                        if (compare(h1.get(key1), key2) < 0) {
                            h1.put(key2, h1.get(key1));
                        } else {
                            h1.put(h1.get(key1), key2);
                        }
                    } else {
                        h1.put(key1, key2);
                    }
                } else {
                    if (h1.containsKey(key2)) {
                        if (compare(h1.get(key2), key1) < 0) {
                            h1.put(key1, h1.get(key2));
                        } else {
                            h1.put(h1.get(key2), key1);
                        }
                    } else {
                        h1.put(key2, key1);
                    }
                }
            }
            return h1;
        }, (k1, k2) -> k1);
        synonymsMap.forEach((k, v) -> System.out.println(k + "：" + v));
        // Jon John  John Johnny   Chris Kris   Chris Christopher

        Map<String, String> newSynonymsMap = new HashMap<>();

        synonymsMap.forEach((k, v) -> {
            newSynonymsMap.put(k, v);
            if (!synonymsMap.containsKey(v)) {
                newSynonymsMap.put(v, v);
            }
        });
        // [Jon John]  [John Johnny]   [Chris Kris]   [Chris Christopher] [Johnny Johnny] [Kris Kris] [Christopher Christopher]

        Map<String, Integer> resultMap = new HashMap<>();

        nameMap.forEach((k, v) -> {
            String rootKey = find(newSynonymsMap, k);
            if (resultMap.containsKey(rootKey)) {
                resultMap.put(rootKey, resultMap.get(rootKey) + v);
            } else {
                resultMap.put(rootKey, v);
            }
        });
        List<String> list = resultMap.entrySet().stream().map(entry -> entry.getKey() + "(" + entry.getValue() + ")").collect(Collectors.toList());
        return list.toArray(new String[list.size()]);
    }

    public String find(Map<String, String> map, String name) {
        return name.equals(map.get(name)) || map.get(name) == null ? name : find(map, map.get(name));
    }

    /**
     * @return a>b 1 a=b 0 a<b -1
     */
    public int compare(String a, String b) {
        int size = Math.min(a.length(), b.length());
        for (int i = 0; i < size; i++) {
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);
            if (c1 != c2) {
                return c1 - c2;
            }
        }
        return a.length() - b.length();
    }
}
