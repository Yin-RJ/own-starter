package com.yinrj.redisspringbootstarter.annotation;

import com.yinrj.redisspringbootstarter.selector.OwnImportSelector;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author yinrongjie
 * @version 1.0
 * @date 2022/7/3
 * @description
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@AutoConfigurationPackage
@Import(OwnImportSelector.class)
public @interface EnableOwnAutoImport {
}
