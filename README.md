## 前言
这个框架大家都是特别熟悉的了，JakeWharton大神的作品，[项目地址](https://github.com/JakeWharton/butterknife)，怎么用我就不多讲了，可以去参考[官方文档](http://jakewharton.github.io/butterknife/)，今天主要来扒一扒里面的源码

本文讲解项目地址 [TestButterKnife](https://github.com/foxleezh/TestButterKnife)

## ButterKnife能解决什么问题？
我个人认为主要是两个方面：
* 1.避免写烦琐的findviewbyid,以及一些资源的获取，比如getString
* 2.避免写一些交互事件，比如setOnclickListener

平常我们要绑定View到Activity上，都得一步步写findviewbyid，setOnclickListener,代码显得多余，而用了butterKnife就简洁了很多，而且配合一些插件比如Android ButterKnife Zelezny,一键生成所有需要的ButterKnife代码，写起来不要太爽！
