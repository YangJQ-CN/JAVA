# 本地仓库

```
git init 创建git仓库
你的本地仓库由 git 维护的三棵“树”组成。
```
## 第一个是你的 工作目录，它持有实际文件；

## 第二个是 暂存区（Index），它像个缓存区域，临时保存你的

## 改动；

## 第三个是 HEAD，它指向你最后一次提交的结果。

### 添加和提交

### 你可以提出更改（把它们添加到暂存区），使用如下命令：

git add <filename>
git add *
这是 git 基本工作流程的第一步；使用如下命令以实际提交改动：
git commit -m "代码提交信息"
现在，你的改动已经提交到了 HEAD，但是还没到你的远端仓库。
git在执行git add命令时出现以下警告：
warning: LF will be replaced by CRLF in test1.txt. The file will have its original line endings in
working directory
原因

## 因为Git的换行符检查功能。LF是linux下的换行符，而CRLF是enter +

## 换行。

## Git提供了一个换行符检查功能（core.safecrlf），可以在提交时检查文

## 件是否混用了不同风格的换行符。这个功能的选项如下：

## false - 不做任何检查

## warn - 在提交时检查并警告

## true - 在提交时检查，如果发现混用则拒绝提交

## 在windows10中：git config --global core.autocrlf true 解决问题


# 分支操作

### 分支原理

git branch   查看所有分支
git branch [分支名称]  创建分支
git checkout [分支名]  切换分支
git merge [分支名] 将指定的分支合并到当前分支（git branch 仍能看到
被合并的分支，合并后两个分支都指向同一分内容，修改其中一个，另一个也会变）
git branch -d [分支名]   删除分支
git diff  比较文件的不同
当工作区有改动，临时区为空，diff的对比是“工作区与最后一次commit提交的仓库的共同文
件”；
当工作区有改动，临时区不为空，diff对比的是“工作区与暂存区的共同文件”。
有master和test两个分支，它们有相同的文件，改变了test中的文件，但
不add，commit。切换到master，文件也发生了变化。如果，test中add，
commit后，master中的文件又变回了之前的文件。

# 远程仓库

```
git remote add [远程仓库名字] [远程仓库地址]  创建远程仓库
git remote   查看远程仓库
git remote -v  查看远程仓库和地址
```

### 从远程仓库下载新分支与数据:

git fetch
该命令执行完后需要执行git merge 远程分支到你所在的分支：
git merge origin/master
从远端仓库提取数据并尝试合并到当前分支：
git merge
git push [远程仓库地址] [远程仓库的分支] （目前要先add，commit再push
到远程仓库）


