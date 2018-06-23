# crud 

a starter app for spring boot 2

基于 spring 的技术栈，我觉得痛点主要在持久层，现在方案主要有 hibernate 和 mybatis。由于现在前端
mmvc框架和后台 no-sql 的流行， json 的使用量激增，要拥抱这种变化，我觉得有必要选择更灵活的持久层框架，
而 hibernate 的强关系模型和 mybatis 的 xml 配置文件，降低了这种灵活性。

经过大量考察和使用，我觉得基于 beetl 和 beetlsql 的技术栈较好了的解决这个问题。且两个框架来自同一个作者，
天生适合配合一起使用。

1. beetl 作为高效前端引擎，胜任视图渲染任务。
2. beetlsql 使用 markdown 管理 sql，很简洁； 用 beetl 模板引擎生成动态 sql，非常灵活。
3. beetlsql 的 TailBean 可以灵活的返回除主对象外额外的几个字段。

所以我做了这么一个基本的 crud springboot starter app，技术选型如下：

- spring boot and spring mvc
- mysql and druid
- beetl and beetlsql

## 特性
1. 类似 BaseMapper， 增加 BaseService