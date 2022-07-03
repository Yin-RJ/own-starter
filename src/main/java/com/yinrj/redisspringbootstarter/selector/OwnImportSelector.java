package com.yinrj.redisspringbootstarter.selector;

import com.yinrj.redisspringbootstarter.demo.First;
import com.yinrj.redisspringbootstarter.demo.Second;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author yinrongjie
 * @version 1.0
 * @date 2022/7/3
 * @description
 */
public class OwnImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{First.class.getName(), Second.class.getName()};
    }
}
