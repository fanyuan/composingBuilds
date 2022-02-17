package com.example.versionplugin;

public class DependencyManagerJava {
    public static class BuildConfig {
        //----------arouter 配置 start----------------------------------
        public static final String arouter_api = "com.alibaba:arouter-api:1.5.2";
        public static final String arouter_compiler = "com.alibaba:arouter-compiler:1.5.2";
        //----------arouter 配置 end----------------------------------

        //----------rxjava 配置 start----------------------------------
        public static final String rxjava_rxandroid = "io.reactivex.rxjava3:rxandroid:3.0.0";
        public static final String rxjava_rxjava = "io.reactivex.rxjava3:rxjava:3.0.4";
        //3.0这个是基于androidx的
        public static final String rxlifecycle = "com.trello.rxlifecycle3:rxlifecycle:3.0.0";
        public static final String rxlifecycle_android = "com.trello.rxlifecycle3:rxlifecycle-android:3.0.0";
        public static final String rxlifecycle_components = "com.trello.rxlifecycle3:rxlifecycle-components:3.0.0";
        //----------rxjava 配置 end----------------------------------
    }
}
