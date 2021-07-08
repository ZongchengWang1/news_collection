# news_collection

## 项目描述

<img width="638" alt="Screenshot 2021-07-08 192238" src="https://user-images.githubusercontent.com/77102785/124916578-66eaae80-e025-11eb-962a-ea0aebe34d35.png">

1. 基本的新闻入口界面，不同的新闻类别下有不同新闻的标题和点击标题后看到新闻正文
2. 有网络时从网络获取新闻，并缓存到本地db
3. 无网络时从db获取新闻


## 项目进展

1. 从Android Studio的模板中创建Tabbed Activity
<!-- ![Lark20210708-214239](https://user-images.githubusercontent.com/77102785/124932319-8e497780-e035-11eb-8d85-9d17433d255f.png)
![Lark20210708-214247](https://user-images.githubusercontent.com/77102785/124932322-8f7aa480-e035-11eb-8e85-8fc2c3ede6e3.png) -->

<div style="float:left;border:solid 1px 000;margin:2px;"><img src="https://user-images.githubusercontent.com/77102785/124932319-8e497780-e035-11eb-8d85-9d17433d255f.png"  width="200" height="360" ></div>
<div style="float:left;border:solid 1px 000;margin:2px;"><img src="https://user-images.githubusercontent.com/77102785/124932322-8f7aa480-e035-11eb-8e85-8fc2c3ede6e3.png" width="200" height="360" ></div>

2. 参考郭霖《Android第一行代码》 中第四章的实践-新闻应用，把FrameLayout植入到前一个的Fragment_main的layout文件中，可以实现recycleView上下滑动并显示一些假数据
<!-- ![Lark20210708-215756](https://user-images.githubusercontent.com/77102785/124934779-9dc9c000-e037-11eb-8cf1-6378e165e3c2.png)
![Lark20210708-215807](https://user-images.githubusercontent.com/77102785/124934784-9f938380-e037-11eb-9ab9-63909c730e50.png) -->
<div style="float:left;border:solid 1px 000;margin:2px;"><img src="https://user-images.githubusercontent.com/77102785/124934779-9dc9c000-e037-11eb-8cf1-6378e165e3c2.png"  width="200" height="360" ></div>
<div style="float:left;border:solid 1px 000;margin:2px;"><img src="https://user-images.githubusercontent.com/77102785/124934784-9f938380-e037-11eb-9ab9-63909c730e50.png" width="200" height="360" ></div>

3. 通过学习书中网络技术的学习，主要是OkHttp，和XML格式数据的解析，可以从网络更新数据到本地，但实现方式还是在UI_Thread中进行了网络请求，是不规范的

<!-- ![Lark20210708-221605](https://user-images.githubusercontent.com/77102785/124937603-1fbae880-e03a-11eb-8a30-7e114b9218b5.png)
![Lark20210708-221609](https://user-images.githubusercontent.com/77102785/124937610-20ec1580-e03a-11eb-9645-d4b4f8741557.png) -->

<div style="float:left;border:solid 1px 000;margin:2px;"><img src="https://user-images.githubusercontent.com/77102785/124937603-1fbae880-e03a-11eb-8a30-7e114b9218b5.png"  width="200" height="360" ></div>
<div style="float:left;border:solid 1px 000;margin:2px;"><img src="https://user-images.githubusercontent.com/77102785/124937610-20ec1580-e03a-11eb-9645-d4b4f8741557.png" width="200" height="360" ></div>

4. 学习并使用ViewPage中的 OnPageListener 去监听左右滑动，实现新闻类型变更时标题的更新，滑动操作可以监听到，但是出现了新闻类型与标题对应不上的问题，请教导师，导师建议重建以梳理项目

<!-- ![Lark20210708-223609](https://user-images.githubusercontent.com/77102785/124940884-ef287e00-e03c-11eb-9eb9-afeb03adea0e.png)
![Lark20210708-223613](https://user-images.githubusercontent.com/77102785/124940892-f0f24180-e03c-11eb-9f34-2d5d554cd069.png) -->


<div style="float:left;border:solid 1px 000;margin:2px;"><img src="https://user-images.githubusercontent.com/77102785/124940884-ef287e00-e03c-11eb-9eb9-afeb03adea0e.png"  width="200" height="360" ></div>
<div style="float:left;border:solid 1px 000;margin:2px;"><img src="https://user-images.githubusercontent.com/77102785/124940892-f0f24180-e03c-11eb-9f34-2d5d554cd069.png" width="200" height="360" ></div>

5. 接下来的数据库部分内容也只能等工作空余时间补全了

## 项目中问题总结

https://blog.csdn.net/weixin_35691921/article/details/106520749

https://blog.csdn.net/zxnlmj/article/details/25887447

https://blog.csdn.net/qq_33242956/article/details/104966631

https://my.oschina.net/u/2531348/blog/613037

https://blog.csdn.net/qq_33238562/article/details/103289965

## Todo

1. 不要根据模板，不要从谷歌的库里面建，里面的很多内容对于我来说太高深了，我应该用基础的控件去实现
2. 网络请求的规范操作
3. 在有一定基础再去理解viewpage，去解我的那个滑动tab对应不上的bug
4. 完善缓存数据库部分的内容
