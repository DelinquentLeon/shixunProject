# 项目

本仓库为 重庆大学实训 github 仓库。

## 分支


`main` 分支用于正式库打包


## 克隆

```bash
git clone https://github.com/DelinquentLeon/shixunProject.git
```


## 切换分支

```bash
git checkout bran-username
```

## push

为避免 WebStorm 出现 ESLint 检查不通过无法上传 git 的情况，建议使用下列命令行语句 push 到仓库。

```bash
git add .
```

```bash
git commit --no-verify -m "上传评论"
```

```bash
git push origin
```

# 规范

## 代码规范


### 分号

1. 不需要分号。
2. 有的语句必须添加分号，此时加上即可。

## 提交规范

使用语义化 commit 信息：

格式：`<type>: <content>`（建议 `<content>` 采用英文）

示例：`feat: add team module`

```bash
feat: add team module
^--^  ^-------------^
|	  |
|	  +-> content 内容总结
|
+-------> type: feat, fix, docs, test, style, refactor, UI, perf.

feat：新的功能；
fix：修复错误；
docs：文档变更；
test：添加测试；
style：代码风格变更；
refactor：代码重构，注意与 feat、fix、style 区分；
UI：界面样式修改；
perf：性能提升。
```
