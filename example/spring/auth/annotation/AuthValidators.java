package auth.annotation;

import auth.IDataFilterProcess;
import auth.constant.AuthConstant;
import auth.support.process.AuthFieldFilterProcess;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 权限字段过滤器
 */
@Target({ElementType.METHOD, ElementType.TYPE})
//Retention注解决定AuthValidators注解的生命周期
@Retention(RetentionPolicy.RUNTIME)
//Target注解决定AuthValidators注解可以加在哪些成分上，如加在类身上，或者属性身上，或者方法身上等成分
/*
 * @Retention(RetentionPolicy.SOURCE)
 * 这个注解的意思是让AuthValidators注解只在java源文件中存在，编译成.class文件后注解就不存在了
 * @Retention(RetentionPolicy.CLASS)
 * 这个注解的意思是让MyAnnotation注解在java源文件(.java文件)中存在，编译成.class文件后注解也还存在，
 * 被AuthValidators注解类标识的类被类加载器加载到内存中后AuthValidators注解就不存在了
 */
/*
 * 这里是在注解类AuthValidators上使用另一个注解类，这里的Retention称为元注解。
 * Retention注解括号中的"RetentionPolicy.RUNTIME"意思是让AuthValidators这个注解的生命周期一直程序运行时都存在
 */
public @interface AuthValidators {


}
