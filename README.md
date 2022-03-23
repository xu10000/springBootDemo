### 使用的库
1. fastjson  
2. lambok  减少get set注解
3. devtools 热更新
4. mybatisPlus orm框架
5. mybatis-generator 集中承了swagger2
6. 同步mysql代码在test/java/CodeGeneratorTest
    a. controller模板在resources/templates
    b. 项目无法运行, 需要导入controller和User缺失的包
    c. 模板需要修改不要用JsonReturn这个私人包
