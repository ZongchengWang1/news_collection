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
<div style="float:left;border:solid 1px 000;margin:2px;"><img src="https://user-images.githubusercontent.com/77102785/124932322-8f7aa480-e035-11eb-8e85-8fc2c3ede6e3.png" width="200" height="260" ></div>

2. 参考郭霖《Android第一行代码》 中第四章的实践-新闻应用，把FrameLayout植入到前一个的Fragment_main的layout文件中，可以实现recycleView上下滑动并显示一些假数据
3. 通过学习书中网络技术的学习，主要是OkHttp，和XML格式数据的解析，可以从网络更新数据到本地，但实现方式还是在UI_Thread中进行了网络请求，是不规范的
4. 学习并使用ViewPage中的 OnPageListener 去监听左右滑动，实现新闻类型变更时标题的更新
