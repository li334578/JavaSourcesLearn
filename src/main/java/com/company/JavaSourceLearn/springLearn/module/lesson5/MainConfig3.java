package com.company.JavaSourceLearn.springLearn.module.lesson5;

import com.company.JavaSourceLearn.springLearn.module.lesson5.dir1.CompontentScanModule1;
import com.company.JavaSourceLearn.springLearn.module.lesson5.dir2.CompontentScanModule2;
import org.springframework.context.annotation.Import;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-11 13:28:55
 */
@Import({CompontentScanModule1.class, CompontentScanModule2.class})
public class MainConfig3 {
}
