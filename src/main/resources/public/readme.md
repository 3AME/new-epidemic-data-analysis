 [TOC]  

## 系统页面说明
  1. index.html 系统首页，可以作为整个系统的框架使用，在框架内填充内容即可
  2. world_epidemic_situation.html 世界疫情分布
  3. countries_epidemic_situation.html 国家疫情分布情况
  4. 其他html，暂时未建，对应index中的菜单跳转

## 模板相关说明
  1. page-container:页面主体，菜单、图表展示均在这个div中填充
  2. page-sidebar-wrapper：菜单
  3. row:放置页面主要内容  col-md-16：放置小框架  portlet-body：放置echart图


## 如何使用模板
  1. 在 v4.1.0/theme/templates/admin4/index.html中选取合适的组件，查看网页源代码，找到对应部分的代码，粘贴到系统框架内，根据自己的需求进行修改即可。
  2. 样式可以使用模板自带的，也可暴力修改。
  3. 将所有`../../assets`改为`assets`

## echart引入
  **echart相关的js文件存放在echat目录下，直接引用即可。**

## git的基本使用
### 学习链接
 1. [廖雪峰的官方网站](https://www.liaoxuefeng.com/wiki/896043488029600)
 2. [在idea中配置git环境](https://blog.csdn.net/qq_36938617/article/details/88959854)
 3. [Github桌面版基本使用教程](https://www.jianshu.com/p/1e45b93bd593)
### 基本使用命令
 1. git安装、建立仓库、管理按照学习链接1学习即可。
 2. 建议使用GitHub桌面版，操作简单，可视化，更容易理解，不容易踩坑。
 ***  
  *安装GitHub桌面版，从[Data analysis visualization](https://github.com/3AME/Data-analysis-visualization)中clone项目到本地。*  
  *clone到本地的项目用vscode打开（此处使用的是vscode，其他工具也可以）。vscode中会显示修改的代码，可以撤回所有修改等。到桌面版GitHub中可以看到你修改的代码显示在changes中，写上描述即可推送到本地仓库。确保没有冲突之后推送到远程仓库。*
 ***  
 3. 关于工作区
 ***  
 *默认的工作区是`master`，所有代码最后也将合并到`master`。建议在`master`（主分支）工作，推送的时候创建新发分支进行推送，再进行分支合并。详情见学习链接。*
 ***  
 4. 分支管理
 ***
  *会创建分支，合并分支。*  
 ***
 5. 解决冲突
 ***  
  *合并分支时，你和你的队友可能同时修改了某一处的代码，这样会产生冲突，这种时候应该进入GitHub桌面版提示的冲突部分的代码，对比两种不同修改，选择一个修改进行保留。*
 ***  
 6. 版本回退
    > 查看历史提交版本  
    `$ git log`  

    > 当前版本回退到上一个版本。`HEAD^`表示上一个版本，上上个版本`HEAD^^`，往上100个版本`HEAD~100`  
    `$ git reset hard HEAD^`  

    > 恢复到新版本（回退之后后悔了）。`git reflog`用来记录你的每一次命令。`commit_id`是指`git reflog`命令以后输出的版本号，根据要到的版本进行查看  
    `$ git reflog`  
    `$ git reset hard commit_id`  
 7. 删除文件
    > 先添加test.txt文件，并提交到版本库，现在还为提交到远程仓库  
    `$ git add test.txt`  
    `$ git commit -m "add test.txt"`  

    > 删除工作区文件  
    `$ rm test.txt`  

    > 用status查看提交的状态，知道哪些文件被添加/删除  
    `$ git status`  

    > 确定要从版本库中删除该文件  
    `$ git rm test.txt`  
    `$ git commit -m "remove test.txt"`  

    > 删错了，版本库里的还存在，将误删的文件恢复。用版本库里的版本替换工作区的版本   
    `$ git checkout  test.txt`  

 8. 撤销修改
     *学习链接是基于命令的，桌面版GitHub可以直接使用`revert this commit`（还原此次提交）。*  
 9. 几个概念
    > 本地  
     *即自己的工作环境。*  
    > 暂存区  
     *`git add xxx`之后添加的文件进入暂存区。*  
    > 本地仓库  
     *`git commit -m 'xxxxx'`将文件推到本地仓库。*  
    > 远程仓库  
     *`git push -u origin master`把修改推到远程仓库。*  
 10. 基本使用命令(**使用GitHub桌面版不用使用这些命令**)  
    > 拉取远程仓库的最新内容并合并  
    `git pull origin master`  
    `git add xxx`  
    `git commit -m 'xxxxx'`  
    `git push -u origin master`  
