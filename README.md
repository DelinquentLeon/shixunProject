# 项目

本仓库为 重庆大学实现 github 仓库。

## 分支

开发者建立 `dev-username` 分支，并在每次书写代码前合并 `dev` 开发分支代码。

`main` 分支用于正式库打包，`dev` 分支用于测试库打包。

## CI/CD

略，之后填写。

## 环境

该项目以 Antd Pro&Umi 为大框架，并使用 `react-quill` 处理富文本框、`react-copy-to-clipboard` 处理鼠标键盘复制。

# 运行

## 克隆

```bash
git clone https://github.com/Yucohny/TMIS.git
```

## 安装依赖

```bash
npm install
```

该项目依托于 Antd Pro，因此依赖包较为庞大，可能需要执行一段时间。但是可以使用 Antd Pro 推荐的 `tyarn` 进行安装：

```bash
npm install yarn tyarn -g
```

```bash
tyarn install
```

## 切换分支

```bash
git checkout dev-username
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

### 缩进

参考 `.editorconfig`

1. 缩进采用制表符 tab。
2. 缩进采用 4 格空格，看的更加清楚一些。

### 引号

参考 `.eslintrc.js`

1. 采用单引号

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
