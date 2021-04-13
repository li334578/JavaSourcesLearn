package com.company.JavaSourceLearn.springLearn.module.lesson5;

import com.company.JavaSourceLearn.springLearn.module.lesson5.dir6.Configuration3;
import com.company.JavaSourceLearn.springLearn.module.lesson5.dir6.DeferredImportSelector1;
import com.company.JavaSourceLearn.springLearn.module.lesson5.dir6.ImportSelector1;
import org.springframework.context.annotation.Import;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-11 15:28:58
 */
@Import({
        DeferredImportSelector1.class,
        Configuration3.class,
        ImportSelector1.class,
})
public class MainConfig7 {
}
