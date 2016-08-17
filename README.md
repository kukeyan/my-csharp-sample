﻿C# 的例子代码


# 基础部分.


### A0000_BaseFunction

System.Collections 下 ArrayList、Hashtable、Queue、SortedList、Stack 操作的例子


### A0001_Partial

partial 关键字的使用例子



### A0002_Assert
Debug.Assert  实现 断言 处理的使用例子




### A0003_TraceLog
Trace 方法  实现 跟踪配置 处理的使用例子




### A0004_yield

yield 的使用例子.
优点在于, 当需要返回一个比较大的数据列表.  并且结果列表的每一行, 都要花费比较长的时间进行处理的情况下.
普通的处理方式, 是全部结果数据都获取完了, 才能返回.
yield 的处理方式, 是有一行数据, 先返回一行. 而不是全部获取完了， 才一起返回.
这样对于某些耗时的处理， 可以迅速地先返回部分数据， 让用户能够看到。





### A0005_Reflection
反射 操作的例子 （普通的例子，与泛型的例子）



### A0006_Reflection2
反射 操作的例子 II



### A0007_Reflection_ModelCopyer
通过反射, 复制两个类的属性的例子  ( 用于 系统生成类 -- 自定义类 直接的数据复制 )






### A0010_OO
接口、抽象类、实现类 以及在方法上 abstract、virtual、override、new 的例子




### A0011_OO_Mul_Interface
一个类实现多接口，且接口有同名方法，要求不同实现的例子




### A0012_OO_AutoProp
自动实现的属性的例子




### A0013_OO_Constructor
构造函数 与 析构函数 的例子





### A0015_OverloadOperator
重载运算符 的例子
这里通过一个  长度3位，范围 000 - Z99，其中低位为十进制 范围 00 - 99，高位为 36进制 范围 0-9 A-Z 的 序列号类来做 重载运算符 的操作。





### A0016_ExtensionMethods

扩展方法给我们提供了一种很便捷的方式，
通过这种方式我可以给那些不是我们自己创建的类(如第三方组件里面的)
或是我们不能直接修改的类添加方法。







### A0016_IMPLICIT_EXPLICIT
implicit 与 explicit 关键字的例子. 用于实现 类与类之间转换处理.
也就是对于
B b = new B();
显式的 A a = (A) b; 与隐式 的  A a = b;







### A0017_RandomCode
随机码生成器例子









### A0020_Function
函数中、参数数量可变、REF、OUT 的例子




### A0030_Event
事件处理的例子




### A0031_delegate
委派 的例子




### A0032_MulEvent
链接事件 的例子




### A0033_MulDelegate
多重委派 的例子




### A0040_Indexer
索引器 的例子




### A0050_TryCatchFinally
Try / Catch/ Finally 的例子




### A0055_GenericMethod
泛型方法的例子





### A0056_Covariant
协变(covariant)
协变：让一个带有协变参数的泛型接口（或委托）可以接收类型更加精细化，具体化的泛型接口（或委托）作为参数，可以看成OO中多态的一个延伸。

通常，协变类型参数可用作委托的返回类型，而逆变类型参数可用作参数类型。
对于接口，协变类型参数可用作接口的方法的返回类型，而逆变类型参数可用作接口的方法的参数类型。






### A0057_Contravariant
逆变 (contravariant)
逆变：让一个带有协变参数的泛型接口（或委托）可以接收粒度更粗的泛型接口或委托作为参数，这个过程实际上是参数类型更加精细化的过程。

通常，协变类型参数可用作委托的返回类型，而逆变类型参数可用作参数类型。
对于接口，协变类型参数可用作接口的方法的返回类型，而逆变类型参数可用作接口的方法的参数类型。






### A0060_Enum
枚举 的例子





### A0065_Switch
Switch 语句， goto 处理的例子






### A0070_CustomAttributes
类特性 的例子




### A0071_Deprecated
过期（Deprecated / Obsolete） 的例子




### A0075_AOPAttributes
通过 Attributes 实现 AOP 的例子





### A0076_AOPDynamicObject
通过 DynamicObject 实现 AOP 的例子






### A0080_checked
溢出检测 的例子




### A0090_Resource
读写资源文件 的例子





### A0095_RegistryHelper
读写注册表的例子





### A0100_File
读写文本文件 与 二进制文件 的例子






### A0101_NewtonsoftJson
使用 Newtonsoft.Json ， 进行 序列化 / 反序列化  的例子






### A0101_ProtocolBuffers
使用 protobuf-csharp-sport  进行 序列化 / 反序列化 的例子  （引用 Google.ProtocolBuffers ）
（ 相对于 protobuf-net， 这个版本的，比较遵循Google 的原生态写法，跨平台选择此版本比较好。 ）






### A0101_Serializable
序列化 / 反序列化 的例子
（ProtocolBuffers 序列化的，使用了 protobuf-net 来完成，写法上比较符合c#一贯的写法。 如果不跨平台，全部都是 C# 写的，使用这个比较合适。 ）






### A0102_Path
获取应用程序 当前路径 的例子




### A0103_FileEncoding
文件编码格式转换 的例子




### A0104_ConvertHtmlToUTF8

某个小工具代码，用于将 普通编码的 html 文件， 转换为 utf-8 的 html 文件
（本工具会覆盖掉原有的代码，使用前需做好备份）






### A0110_DateTime
日期/时间间隔 使用 的例子




### A0120_Schedule
定时执行任务的例子,  以及定时执行任务时,遇到超时,先停止再执行的例子.




### A0130_SocketServer
Socket 服务端处理的例子。 接收到请求后，接收一条消息，发送反馈后断开。（短连接处理逻辑）




### A0131_UdpSocketServer
UDP Socket 发送消息的例子




### A0132_NamedPipeServer
使用命名管道通过网络在进程之间进行通信 服务端




### A0133_AnonymousPipeServer
使用匿名管道进行本地进程间通信 服务端




### A0134_MemoryMappedFileServer
持久内存映射文件 服务端  （创建、读取、修改内存映射文件）




### A0136_SocketAsyncEventArgsServer
使用 SocketAsyncEventArgs 异步通信的例子(服务端)




### A0137_SocketServerPlus
A0130_SocketServer 的升级版本， 接收到请求后，新开一个线程，专门用于处理当前用户的请求。（长连接处理逻辑）










### A0140_SocketClient
Socket 客户端处理 的例子 （短连接处理逻辑）




### A0141_UpdSocketClient
UDP  Socket 接收消息的例子




### A0142_NamedPipeClient
使用命名管道通过网络在进程之间进行通信 客户端




### A0143_AnonymousPipeClient
使用匿名管道进行本地进程间通信 客户端  (由服务端调用启动)





### A0144_MemoryMappedFileClient
持久内存映射文件 客户端  （读取、修改内存映射文件）







### A0145_WebRequest_WebClient
使用 WebRequest,  WebClient  来从网页上面获取数据的例子




### A0145_HttpClient
使用 System.Net.Http.HttpClient 从网页上面获取数据的例子







### A0146_SocketAsyncEventArgsClient
使用 SocketAsyncEventArgs 异步通信的例子(客户端)





### A0147_SocketClientPlus
Socket 客户端处理 的例子 （长连接处理逻辑）










### A0150_Access
访问 Access 数据库的例子




### A0151_Excel
以数据库方式访问 Excel 的例子 (使用 OleDB)





### A0160_SQL_Server
访问 SQL Server 数据库的例子




### A0161_SQL_Server_Porc_UnitTest
SQL Server 数据库存储过程／函数　单元测试的例子　
本存储过程，为 SQL Server 下，创建 流水号的 的处理.
支持
[固定前缀]+年月日+序号 、
[固定前缀]+年月+序号 、
[固定前缀]+年+序号
等的 生成方式。





### A0162_SQL_Server_Func_MyRule_UnitTest
SQL Server 数据库 函数　单元测试的例子　
本次测试的函数，为 SQL Server 下， 组织结构、用户、角色、模块、模块动作的 一套体系结构。
其中、组织结构 与 模块结构 为 树型体系结构.
角色为独立结构（非树型）
用户  多对多  组织结构
用户  多对多  角色
用户  多对多  模块
用户  多对多  模块动作
角色  多对多  模块
角色  多对多  模块动作

对于一个用户
最终可访问的模块 =	用户直接可访问模块（包含模块的子模块）+ 用户角色直接可访问模块（包含模块的子模块）
最终可访问的模块动作 = 用户最终可访问的模块下的“默认可访问模块动作” + 针对用户设置的可访问模块动作 + 针对用户角色设置的可访问模块动作
最终可访问的数据 = 用户所属部门(以及下属部门)的数据.








### A0165_SQL_Server_Oracle

用于测试  System.Transactions.TransactionScope 跨数据库的事务处理的例子。
SQL Server 中有一个存储过程  test_SqlServer_Proc。  Oracle 中有一个存储过程  test_Oracle_Proc 。
先执行 SQL Server 的存储过程，  后执行 Oracle 的存储过程。
只要这2个存储过程中，任意一个失败了， 那么全部回滚掉。






### A0170_Oracle
访问 Oracle 数据库的例子
（使用 微软的类库来访问。  命名空间为  System.Data.OracleClient ）






### A0171_Oracle_ODAC
访问 Oracle 数据库的例子
( 使用 Oracle 的 ODAC 来访问。 命名空间为  Oracle.DataAccess.Client )





### A0172_Oracle_MyRule

使用 Oracle 来 实现  A0162_SQL_Server_Func_MyRule_UnitTest 的 处理 。
因为 Oracle 中， 没有 SQL Server 那种 “表值函数” 的东西。
因此，具体业务处理逻辑， 是以 C# 代码的方式实现的。
( 本项目 使用 Entity Framework 进行处理 )






### A0175_PostgreSQL
访问 PostgreSQL 数据库的例子
（使用 Npgsql.dll 来访问。  命名空间为  Npgsql， C# 端不用安装 PostgreSQL 相关软件 ）







### A0180_MySQL_ODBC
访问 MySQL 数据库的例子 (使用 ODBC)




### A0185_MySQL_MySqlClient
访问 MySQL 数据库的例子 (使用 MySqlClient)




### A0188_SQLite_SQLiteClient
访问 SQLite 数据库的例子




### A0190_A0190_MongoDB
访问 MongoDB 数据库的例子






### A0200_XML
XML 读取/写入 的例子




### A0205_XmlSerializer
通过 XmlSerializer 读取/写入 XML 的例子




### A0210_DataSetXML
通过 DataSet 读取 XML 文件的例子




### A0211_DataTableCompute
通过 DataTable 进行数据计算的例子





### A0300_Thread
最简单的 线程 的例子




### A0301_ThreadAbort
如何中止线程执行 的例子




### A0302_ThreadPriority
线程优先级 的例子




### A0303_ThreadSafe
线程安全/同步 的例子





### A0320_ThreadPool
线程池 的例子





### A0330_ThreadAsyncInvoke
主线程 与 子线程 异步处理 的例子
该例子使用的是：异步编程模型 (APM) 模式（也称 IAsyncResult 模式），
在此模式中异步操作需要 Begin 和 End 方法（比如用于异步写入操作的 BeginWrite 和 EndWrite）。





### A0331_ThreadAsyncInvoke_EAP
主线程 与 子线程 异步处理 的例子
该例子使用的是：基于事件的异步模式 (EAP)，
这种模式需要 Async 后缀，也需要一个或多个事件、事件处理程序委托类型和 EventArg 派生类型。







### A0331_ThreadAsyncInvoke_TAP
主线程 与 子线程 异步处理 的例子
该例子使用的是：基于任务的异步模式 (TAP)
C# 中的 async 和 await 关键词运算符为 TAP 添加了语言支持。
(该项目需要运行在  .Net 4.5 环境下)










### A0340_ThreadReadWrite
生产者 / 消费者 多线程处理 的例子





### A0350_WinFormThread
WinForm 下，多线程处理 的例子 （用于避免长时间操作，画面卡住）




### A0351_WinFormThreadTwoPart
WinForm 下，多线程处理 的例子
（几种 串行/并行 处理方式的对比，）
某些 Case 使用了 .NET 4.0 的新特性.




### A0352_WinFormThreadInvokeParam
WinForm 下， Control.Invoke 方法， 获取返回值的处理例子。
因为某些情况下， 多线程的处理过程中， 需要先从画面上， 获取部分数据，然后再针对获取到的数据，执行相应的处理。





### A0360_Timers
定时器处理的例子代码。





### A0370_Lazy
延迟初始化处理的例子。
用于在一个  父子关系的 结构里面，  当加载  父列表数据的时候， 不立即加载子列表，而是当使用的时候，才加载。






### A0380_Task
.NET 4.5 中  Task / async / await  使用的例子。













### A0400_String
字符串处理 与 正则表达式 的例子




### A0410_Globalization
本地化 的例子





### A0411_ChinesePinyin
汉语拼音 的例子
(注:  此项目需要  安装  Visual Studio International Pack 1.0 SR1 中的
[Simplified Chinese Pin-Yin Conversion Library - 支持获取简体中文字符的常用属性比如拼音，多音字，同音字，笔画数。] )






### A0412_ChinesePinyin
汉语拼音 的例子
(注:  此项目需要  安装  Visual Studio International Pack 1.0 SR1 中的
[Simplified Chinese Pin-Yin Conversion Library - 支持获取简体中文字符的常用属性比如拼音，多音字，同音字，笔画数。] )





### A0415_NumericFormatting

数字 格式化为 汉字的处理， 例如 456789 处理成
简体中文: 四十五万六千七百八十九
繁体中文: 肆拾伍萬陸仟柒佰捌拾玖
日文: 四拾伍萬六阡七百八拾九
(注:  此项目需要  安装  Visual Studio International Pack 2.0   )






### A0420_Log
使用 System.IO.Log 实现日志记录 的例子







### A0500_LINQ_Base1
最基本的 LINQ 的例子 使用 int 数组作为数据源 的例子




### A0501_LINQ_Base2
基本的 LINQ 的例子 使用 自己创建的类 的集合作为数据源 的例子





### A0500_LINQ_Base3

以 Nunit 的方式，
测试 All、Any、
Count、
First、FirstOrDefault、
Last、LastOrDefault、
Max、Min、
OrderBy、OrderByDescending、
Reverse、
Select、SelectMany、
Single、SingleOrDefault、
Skip、SkipWhile、
Sum、
Take、TakeWhile、
Where 方法的例子。






### A0510_LINQ_XML
LINQ to XML 关于 XML 文件读取 的例子





### A0511_LINQ_XML_Query
LINQ to XML 关于 XML 的 LINQ 查询 的例子





### A0520_LINQ_DataSet
LINQ to DataSet 的例子




### A0530_LINQ_SQL
LINQ to SQL 的例子 - 使用 dbml 文件




### A0530_LINQ_SQL_Access
LINQ to SQL  访问  Access  数据库的例子





### A0540_LINQ_SQL
LINQ to SQL 的例子 - 使用 map 文件





### A0550_PLINQ_Base1
最简单的 并行 LINQ 查询 的例子  *要求 .NET Framework 4.0




### A0551_PLINQ_Base2
并行 LINQ 查询的 ForAll 的例子，等价于普通LINQ的 foreach
*要求 .NET Framework 4.0




### A0552_PLINQ_Base3
并行 LINQ 查询 ParallelEnumerable.Max/Min/Average/Sum/Count 操作的例子  *要求 .NET Framework 4.0




### A0553_PLINQ_Base4
并行 LINQ 查询的操作，是否影响排列顺序的例子  *要求 .NET Framework 4.0





### A0600_EF
Entity Framework 的例子




### A0620_EFv4
Entity Framework v4.1 的例子 (需要 .NET 4.0)
本例子中，没有以前的那种 命令行下 执行 EdmGen 产生源代码的处理。
本例子在 C# 中定义了一个 mr_demo_data 类。
在 SQL Server 中，定义一个 mr_demo_data 表
类中的属性，与表中的字段，一一对应。

通过定义一个 DbContext 类。
在 DbContext 中， 为表定义 DbSet。
Business 类 将直接使用 DbContext ，来对特定的表，进行 更新、删除、查询的处理。






### A0621_EF_CodeFirst
Entity Framework CodeFirst 的例子  (需要 .NET 4.0)
CodeFirst 意味着，不是先设计表、或者数据库模型。
而是先从设计 C# 的类开始。
定义具体的业务需求。
最后，通过 C# 中的定义， 来创建数据库与表。
此功能需要 Entity Framework 4.x 支持。





### A0622_EF_OneToMany
Entity Framework 的 One To Many 例子 (需要 .NET 4.0)
Code First在处理多重性关系时应用了一系列规则。
规则使用导航属性确定多重性关系。
即可以是一对导航属性互相指定（双向关系），也可以是单个导航属性（单向关系）。

如果你的类中包含一个引用和一个集合导航属性，Code First视为一对多关系；
如果你的类中仅在单边包含导航属性（即要么是集合要么是引用，只有一种），Code First也将其视为一对多关系；

如果你的类包含两个集合属性，Code First默认会使用多对多关系；

如果你的类包含两个引用属性，Code First会视为一对一关系；
在一对一关系中，你需要提供附加信息以使Code First获知何为主何为辅。





### A0623_EF_ManyToMany
Entity Framework 的 Many To Many 例子 (需要 .NET 4.0)





### A0624_EF_OneToOne
Entity Framework 的 One To One 例子 (需要 .NET 4.0)





### A0630_EF_Inherit_TPH
Entity Framework 的 继承处理的例子 (需要 .NET 4.0)
本例子用于演示 Entity Framework CodeFirst 中 继承 的处理方式。
这里使用的是 默认的 TPH 方式。
也就是 所有的子类，使用同一张表。
该表有一个 Discriminator 列，用于区分各个子类。
这个表的列，包含了各个子类的属性。






### A0631_EF_Inherit_TPT
Entity Framework 的 继承处理的例子 (需要 .NET 4.0)
本例子用于演示 Entity Framework CodeFirst 中 继承 的处理方式。
这里使用的是 TPT 的方式。
也就是 基类使用一张表。
各个子类的使用各自单独的表。





### A0640_EF_Enum
Entity Framework 枚举使用的例子 (需要 .NET 4.0)







### A0650_EF_Oracle
Entity Framework  处理  Oracle 的例子代码
主要测试项目包含：
使用/不使用 延迟加载的对比；
序列号的处理；
存储过程的处理；
事务处理；
并发处理失败的情况





### A0650_EF_SqlServer
Entity Framework  处理  SqlServer 的例子代码
主要测试项目包含：
使用/不使用 延迟加载的对比；
Identity 的处理；
存储过程的处理；
事务处理；
并发处理失败的情况；
Model First 的处理。






### A0650_EF_Document
通过修改 Edmx 文件， 实现为 代码增加注释的功能
因为使用的是 通过 数据库 产生的 edmx 文件。
在数据库中，  表 与 字段，是有备注信息的。
但是将表导入到 开发环境中， 这个 备注信息没有被带过来。
这里写一个程序， 从数据库 读取 表/字段 的备注信息， 然后再去 更新  那个  edmx 文件.








### A0700_Main/ A0701_AutoUpdate/ A0702_CommonFunc
多项目之间 代码引用 的例子





### A0710_Merge
泛型处理 数据合并 的例子 （要求用户继承 Merge 类）




### A0711_Merge

泛型处理 的例子 （要求用户数据类实现 MergeAble 接口）
这里使用了  where（泛型类型约束）  关键字.






### A0720_MultiTime

存在有指定行数的数据，才做处理 的处理例子。
例如 一个月内，消费 2次以上（含2次）的顾客， 享受双倍积分，

为什么写这个类，而不用 SQL 语句直接查询的处理的原因有2点：
1、存在 退货的情况。 一个退货要取消掉 一个消费。
2、需要避免重复计算。
例如 本月15号的时候，已经把上半月 满足 消费 2次以上（含2次）条件的， 都赠送了 双倍的积分了。
月末再次计算的时候，单纯用 SQL 语句处理， 较为麻烦。










### A0730_TimeRange
时间范围 重叠检查处理类.






### A0740_AutoMatch
自动匹配处理类.
用于 顾客 VIP 积分自动兑换礼品处理的算法。
两种算法：
一种是  大数字优先， 也就是  贪婪算法。
优先兑换掉  大积分的商品。
最大积分商品不能兑换时， 尝试兑换 积分第二大的商品。
直到没有商品可兑换了， 结束处理。

一种是  最小剩余，也就是 尽可能把所有的积分使用完毕，不留下多余的部分出来。
例如 礼品有 500；400；300 三个积分档次。
对于 一个有 1200 积分的顾客。
大数字优先算法， 将为该顾客优先兑换 2个 500分的礼品， 然后剩余 200分。
最小剩余算法， 将为该顾客兑换 500；400；300  各一个，  然后剩余 0 分。






### A0750_MainSub

主账户-子帐户拆分处理.
用于 将一个大的金额， 拆分处理成多个 固定大小的金额。
消耗的时候，从前向后消耗， 补充的时候，从后向前补充（补充数值不能大于初始值）。






### A0760_PageToken

页面令牌管理.
用于避免画面重复提交的处理。
每个画面初始化的时候， 系统产生一个令牌。
如果画面处理完毕，那么结束。
如果发生一个画面， 多次提交了，由于令牌是唯一的。
那么后续的提交，将失败。






### A0800_Excel
数据导入/导出 Excel 的例子




### A0801_Excel
数据导入/导出 Excel 的例子 (A0800_Excel 的重构)
目的为了支持 1个数据类，能够创建多种结构的 Excel 表格。





### A0802_Excel
数据导入/导出 Excel 的例子 ( A0800_Excel / A0801_Excel 的重构)
将 Excel 数据导出的结构代码定义， 独立出来。
与 Model 数据类分离.
用户数据类不实现任何接口，仅仅存储基础数据。
Excel 格式的处理，由单独的类进行处理。







### A0803_Excel
数据导入/导出 Excel 的例子 ( A0802_Excel 的 异步处理版本)
关于导出：
本例子代码是 结合  A0340_ThreadReadWrite  与  A0802_Excel 的综合处理.
通过多线程处理
Excel 导出作为  消费者线程来处理数据。
主线程产生数据， 提供给 Excel 导出处理。

关于导入：
本例子代码是结合 A0030_Event 与  A0802_Excel 的综合处理.
通过事件处理
当 Excel 读取到一定行数以后，触发事件给主线程处理。







### A0900_DllImport_StrCmpLogicalW
使用 DllImport 引用 shlwapi.dll 中 StrCmpLogicalW 方法的例子






### A1010_Print
WinForm 环境下，页面设置/打印预览/打印 的例子





### A1020_Hardware
使用 System.Management 获取硬件信息的例子




### A1021_CPU_Info
使用 PerformanceCounter 获取 CPU 使用率的例子




### A1030_SMS
使用 System.IO.Ports.SerialPort  通过 手机 或者 GSM 模块， 发送短消息的例子





### A1040_Password
用于检查密码复杂度的一些处理代码。





### A1050_Email
通过  System.Net.Mail.MailMessage  构造电子邮件信息.
通过  SmtpClient  发送电子邮件的例子.





### A1055_log4net_Email
通过配置  Log4Net， 通过电子邮件，发送日志信息的例子。





### A1060_ImageProperty
获取 照片的 拍摄时间、照相机、光圈、ISO、经纬度 等相关信息






### A1070_Image_Process
图片处理的相关例子， 包含  两张图片合并成一张，   图片缩放。










### A3001_Office_Excel
使用 Microsoft.Office.Interop.Excel 来 读写 Excel 的例子




### A3002_Office_Outlook
使用 Microsoft.Office.Interop.Outlook 来 读写地址簿, 发送邮件 的例子







### A4001_DebugRelease
Vs2010 中， 通过 “生成事件” 管理 app.Debug.config / app.Release.config 的例子。




### A4001_PathAna
Dijkstra算法 最短路径处理的例子代码




### A4002_PI
圆周率的计算 （用于实现一个比较耗 CPU 的处理）





### A4005_Settings
应用程序,修改当前 App.Config 的处理.
















### A5010_WinPopForm
WinForm 环境下， 弹出消息窗口 的例子




### A5020_InputLanguage
WinForm 环境下， 输入法切换 与  Caps Lock 检测的例子






### A5030_Mouse_Event
模拟鼠标移动、点击的处理逻辑  （相当于按键精灵的处理逻辑）




### A5035_SendKeys
模拟键盘按钮处理





### A5040_MDI_SubForm
MDI 应用程序中，子窗口唯一性的控制处理





### A5050_UCbo
WinForm 环境下， 模糊匹配下拉列表的例子





### A5060_TwoScreen

当计算机有2个屏幕的情况下， 程序自动把主窗口，定位在主屏幕上， 把子窗口，定位在第二个屏幕上的处理例子。






### A5070_CheckAbleComboBox
WinForm 下面的 自定义控件， 用于显示 可 Check 的 ComboBox





### A5080_ComboBoxWithImage
WinForm 下面的 自定义控件， 用于显示 带图片显示 的 ComboBox
本项目涉及到的知识点, 还包含  根据大图片,  制作缩略图的处理.
以及 自定义控件中, 如何设置 自定义属性的 扩展的备注信息.







### A5090_MovablePanel
WinForm 下面，通过 鼠标的事件， 实现 图片、Panel 拖动切换的效果.





### A5100_WndProc
消息处理的例子




### A5110_WinFromObserver
多个窗口,通过观察者的方式, 传递数据.






### A5120_WebBrowser
WebBrowser 运行过程中, 不弹 脚本错误对话框的处理
首先，要通过 浏览的方式， 添加引用 c:\windows\system32\shdocvw.dll





### A5121_WebBrowserHtmlText
通过 WebBrowser 实现，  手头有  HTML 文本， 但是想获取最终显示的文本。







### A5125_WebWithAjax
一个测试的网站，只有一个页面，数据通过 Ajax 来加载。




### A5126_WebBrowserAjax

WebBrowser 调用 js 方法的方式， 来获取画面上面的数据。






### A5150_PowerPacks
使用 Microsoft.VisualBasic.PowerPacks 进行 画线,圆,矩形 的相关例子.




### A5200_Chart
使用 System.Windows.Forms.DataVisualization.Charting 绘制图表的例子




### A6000_ImportExe_Main / A6010_ImportExe_Sub

将一个 外部的 Exe, 嵌入到本程序的一个 Panel 里面。
普通 Exe 与 .NET 的 Exe ， 处理机制不同。













# 调用其他工具部分.








### B0010_NVelocity

NVelocity 使用的例子
NVelocity 是 java 的 Velocity 的 .NET 版本
主要是一套模板的引擎。
用于实现  数据 + 模板 = 结果.

可以用于 Web 开发。
本人一般用它来做 代码生成器。
也就是 读取 DB的信息， + 模板文件 =  代码.






### B0020_Log4Net

Log4Net 使用的例子
Log4Net  是 java 的 Log4J 的 .NET 版本
主要是一套 日志处理系统。






### B0030_Ninject

Ninject 使用的例子  (简单的 HelloWorld 例子)
Ninject 是一套 轻量级的 IOC 依赖注入的框架.






### B0031_Ninject
Ninject 使用的例子
本例子用于演示 多种 Bind 方式。
例如： To、ToConstant、ToMethod、ToProvider
以及 IEnumerable 类型的 [Inject] 处理。







### B0032_Ninject
Ninject 使用的例子
本例子用于演示 Object Scopes 演示例子.。
也就是  普通的范围、 单例的范围、 线程的范围。






### B0033_Ninject
Ninject 使用的例子
本例子用于演示 Ninject  中的  Contextual Binding。
包含 Named bindings  attribute bindings





### B0035_Ninject
Ninject 综合使用的例子
本例子用于演示 Ninject 处理一个略为复杂的例子.
本例子包含多个接口,多个实现, 实现中包含依赖注入.







### B0040_MOQ
MOQ 使用的基本例子。




### B0045_MOQ_Ninject
MOQ 与 Ninject 结合使用的例子。





### B0100_NAnt
Nant + Nunit + NUnit2Report  自动化  编译、单元测试、生成测试报表的例子。




### B0200_MapApi

阿里云地图Api 调用，  百度地图Api调用
注：这里仅仅是 通过 地址名称， 获取经纬度。
目前执行的结果是： 同一个地址， 两者返回的 经纬度 差距比较大。

也就是调用 阿里云 的接口，返回的经纬度数据， 就在阿里云的 地图上面去定位。
调用 百度 的接口，返回的经纬度数据， 就在百度的 地图上面去定位。

不要用阿里云 的接口，返回的经纬度数据， 跑去百度地图上面使用。
或者 调用 百度 的接口，返回的经纬度数据，跑去 阿里云上面使用。








### B0300_zxing
调用 Google 的 Zxing.Net 来 生成/解析 二维码的例子.





### B0400_7zip
调用 7zip 压缩 / 接压 文件的例子.




### B0600_SuperSocket
调用 SuperSocket 的例子.





### B0700_FastSocket
调用 FastSocket 的例子











# 加密/解密 部分.





### C0010_SecretKeyEncryption

私钥加密（对称加密） 的例子:
对数据执行转换，使第三方无法读取该数据。 此类型的加密使用单个共享的机密密钥来加密和解密数据。

私钥加密的缺点是它假定双方已就密钥和 IV 达成协议，并且互相传达了密钥和 IV 的值。 一般认为，IV 并不安全，且可以在消息的纯文本中传输。 但是，密钥必须对未经授权的用户保密。 由于存在这些问题，因此通常将私钥加密与公钥加密配合使用，以秘密地传达密钥和 IV 的值。
假定 Alice 和 Bob 是希望在非安全信道上通信的双方，他们可以按如下方式使用私钥加密：Alice 和 Bob 同意对特定的密钥和 IV 应用一种特定的算法（例如 AES）。 Alice 撰写一条消息并创建要在其上发送该消息的网络流（可能是一个命名管道或网络电子邮件）。 接下来，她使用该密钥和 IV 加密文本，并通过 Intranet 向 Bob 发送该加密消息和 IV。 Bob 在收到该加密文本后，可使用 IV 和预先商定的密钥对它进行解密。 即使传输的内容被人截获，截获者也无法恢复原始消息，因为他并不知道密钥。







### C0011_3DES

私钥加密（对称加密）中, 关于 3DES 加密的例子:
主要涉及  CBC模式  与   ECB模式  这两个模式的区别。







### C0012_DES

某些情况下，使用 特定的字符串， 先计算 MD5 ( byte 数组，16位)。
然后使用 MD5 的结果， 作为 DES 的密钥。
进行加密 / 解密 的处理。


整个操作， 是需要与 Java 配合使用的。
C# 加密， Java 解密的处理。

Java 目录下， 为 Java 的测试代码。






### C0020_PublicKeyEncryption

公钥加密（不对称加密） 的例子:
对数据执行转换，使第三方无法读取该数据。此类加密使用公钥/私钥对来加密和解密数据。

公钥加密使用一个必须对未经授权的用户保密的私钥和一个可以对任何人公开的公钥。公钥和私钥在数学上是关联在一起的；用公钥加密的数据只能用私钥解密，而用私钥签名的数据只能用公钥验证。公钥可以提供给任何人；公钥用于对要发送到私钥持有者的数据进行加密。公钥加密算法又称为非对称算法，原因是需要用一个密钥加密数据，而用另一个密钥来解密数据。基本的加密规则禁止密钥重用，并且对于每一个通信会话公钥和私钥都应该是唯一的。但实际上，非对称密钥通常可持续使用。

双方（Alice 和 Bob）可以按照下列方式使用公钥加密：首先，Alice 生成一个公钥/私钥对。如果 Bob 想要给 Alice 发送一条加密的消息，他将向她索要她的公钥。Alice 通过非安全网络将她的公钥发送给 Bob，Bob 接着使用该密钥加密消息。Bob 将加密的消息发送给 Alice，而 Alice 使用她的私钥解密该消息。如果 Bob 通过非安全信道（例如公共网络）接收 Alice 的密钥，则 Bob 可能会受到“中间人”攻击。因此，Bob 必须与 Alice 验证他收到的公钥副本是否正确。

在传输 Alice 的公钥期间，未经授权的代理可能会截获该密钥。而且，同一代理可能截获来自 Bob 的加密消息。但是，该代理无法用公钥解密该消息。该消息只能用 Alice 的私钥解密，而该私钥并没有被传输。Alice 不使用她的私钥加密给 Bob 的答复消息，原因是任何具有公钥的人都可以解密该消息。如果 Alice 想要将消息发送回 Bob，她将向 Bob 索要他的公钥并使用该公钥加密她的消息。然后，Bob 使用与他相关联的私钥来解密该消息。

在此方案中，Alice 和 Bob 使用公钥（非对称）加密来传输私钥（对称），并对其会话的其余部分使用私钥加密。




RSA 允许同时进行加密和签名，但 DSA 只能用于签名，Diffie-Hellman 只能用于生成密钥。通常情况下，公钥算法比私钥算法具有更多的使用限制。








### C0021_RsaWithJava
.NET 生成私钥与公钥，导出为 XML 格式。  Java 读取公钥， 加密数据， C# 使用私钥，解密的处理例子。





### C0022_OpenSsl_Pem2Xml

OpenSsl 生成的证书， 导出 txt 文件后， 转换为 C# 的 xml 密钥数据。
实际使用中， 主要是 OpenSsl 生成证书，  iOS 客户端，使用该证书进行加密处理，  C# 服务端，使用证书导出的文本文件，转换为 C# 的 Xml 私钥文件， 进行解密。






### C0023_OpenSsl
通过简单引用 System.Extended Nuget 包， 实现 RSACryptoServiceProvider 支持读取 OpenSsl 密钥数据





### C0050_SymmetricCryptography_XML
用对称密钥对 XML 元素进行加密/解密




### C0060_AsymmetricCryptography_XML
用非对称密钥对 XML 元素进行加密







### C0100_SignXML
使用数字签名为 XML 文档签名  与  验证 XML 文档的数字签名





### C0200_HashValues

哈希值
哈希算法可将任意长度的二进制值映射为固定长度的较小二进制值，这个小的二进制值就称为哈希值。哈希值是一段数据的数值表示形式。散列一段纯文本时，即使只更改段落中的一个字母，随后的散列计算都会产生不同的值。如果哈希已进行强加密，其值将发生显著更改。例如，如果更改了消息的一个位，强哈希函数就可能生成相差 50% 的输出。很多输入值可能会散列为相同的输出值。但是，要找到散列为同一个值的两个不同的输入，在计算上是不可行的。
双方（Alice 和 Bob）可以使用一个哈希函数来确保消息的完整性。他们将选择一个哈希算法来签署其消息。Alice 将写一条消息，然后使用选定的算法创建该消息的哈希。然后他们将采用以下方法之一：
Alice 向 Bob 发送纯文本消息和哈希消息（数字签名）。Bob 接收该消息并对它进行哈希运算，将他的哈希值与从 Alice 那里接收的哈希值进行比较。如果这两个哈希值相同，则说明消息未被更改。如若不同，则说明该消息在由 Alice 撰写后已被他人更改。
遗憾的是，此方法并没有确立发送方的真实性。任何人都可以模拟 Alice 向 Bob 发送消息。他们可以使用同一哈希算法来签署消息，Bob 能够确定的只是该消息与其签名匹配。这是中间人攻击的一种形式。有关更多信息，请参见下一代加密技术 (CNG) 安全通信示例。
Alice 通过非安全公共通道向 Bob 发送纯文本消息。她通过一个安全的专用通道向 Bob 发送哈希消息。Bob 接收纯文本消息并对它进行哈希运算，将该哈希与私自交换的哈希进行比较。如果两个哈希匹配，则 Bob 可确定两点：
该消息没有被篡改。
消息的发送方 (Alice) 是可信的。
为了使此系统发挥作用，Alice 必须对除 Bob 外的所有人保密其原始的哈希值。
Alice 通过非安全公共通道向 Bob 发送纯文本消息，并将哈希消息置于她的公开网站上。
该方法通过防止任何人修改哈希值而防止了消息被篡改。尽管任何人都可以读取消息及其哈希，但只有 Alice 能够更改哈希值。要模拟 Alice 的攻击者将需要访问 Alice 的网站。
由于 Alice 的消息是以纯文本形式传输的，因此前面的任何方法都无法防止他人读取 Alice 的消息。完整安全性通常需要数字签名（消息签名）和加密。






### C0300_ProtectedMemory

使用数据保护
使用 ProtectedMemory 类对内存中字节数组进行加密。
可以指定由当前进程加密的内存只能由当前进程解密、可以由所有进程解密，或者可以从相同的用户上下文解密。
有关 ProtectedMemory 选项的详细说明，请参见 MemoryProtectionScope 枚举。


使用数据保护对内存中数据进行加密
调用静态 Protect 方法，传递要加密的字节数组、平均信息量和内存保护范围。
使用数据保护对内存中数据进行解密
调用静态 Unprotect 方法，传递要解密的字节数组和内存保护范围。









### C0900_Keys

对称加密 与 非对称加密 过程中， 如何产生 密钥 的处理.
对称加密 是生成一组 Key 与 IV
    这种情况下，是消息的 发送/接受 双方， 都有一个 相同的 Key.
	加密前生成一个新的 IV, 加密数据以后， 将 数据与 IV 一起发送给接收方。
	接收方接收到数据后， 用本地的 Key 与 接收到的 IV 来解密接收到的数据。

非对称加密 是生成一组 公钥与私钥
    这种情况下，是 发送/接受 双方， 都有一组 密钥（公/私）。
	发送方有下列密钥[发送方的 公/私钥， 接受方的公钥]
	接受方有下列密钥[发送方的 公钥， 接受方的公/私钥]
	发送方， 使用 接收方的 公钥， 来加密数据. (同时可以使用 发送方的 私钥， 来做签名)
	接收方， 使用 接收方的 私钥， 来解密数据. (同时可以使用 发送方的 公钥， 来验证签名)






### CR_HelloWorld

水晶报表 Hello World 程序




### D0001_Matrix.Service

矩阵的 加法、减法、乘法 的处理
涉及到的 C# 技术知识点：
1.面向对象 (父类 virtual, 子类 override)
2.索引器
3.重载运算符 (operator +)
4.泛型(where 与 default)
5.System.Dynamic (dynamic 来处理泛型的加减处理)
6.代码协定 (Contract.Requires)


### D0001_Matrix.Test

矩阵处理的单元测试










# 游戏杂项 部分.







### G0001_Sudoku

一个数独计算的项目。
通过 递归， 来实现 回朔 的计算处理。

算法是
1、首先根据现有的数据， 计算出每一个单元格   可能选择 的数据。
2、按照 可能选择 的数据 最少的单元格，  尝试设置数据。 然后再次更新 剩余的 未设置的单元格的 可能选择 的数据。
3、如果全部设置完毕的情况下，返回 true。
4、如果设置后，导致 存在有 还没有设置数据的单元格， 没有 可能选择 的数据 了， 那么意味着本次处理失败， 继续处理 本单元格的 下一个可选数字.
5、如果设置后，当前数据表格中， 所有的未设置数据，都至少存在一个可能选择 的数据，  那么首先将本次处理的数据， 保存到 ”todoList“
6、递归处理 （相当于 继续到 2 的处理步骤去）
7、如果 递归处理 的结果失败了，那么 将本次处理的数据， 从 "todoList" 列表中删除，然后继续处理 本单元格的 下一个可选数字.
8、如果本节点的全部  可能选择 的数据， 都处理失败了， 那么返回 fasle. 回朔到上一个节点去进行判断.






### G0011_Elevator

一个 模拟电梯 上下运行的例子
主要涉及到的知识点：
状态模式.
多线程处理.






### G0021_Calculate.App / G0021_Calculate.Service

模拟出一道计算题，由操作者选择正确答案的情况。（基本无技术含量）







### G0031_QueuingMachine.Machine
排队机的  服务窗口客户端. （Socket 客户端，发送一个请求，针对一个排队号进行处理， 处理完毕后，获取下一个排队号继续处理。）

### G0031_QueuingMachine.Machine
排队机的  排队机客户端. （Socket 客户端，发送一个请求，获取一个排队号）

### G0031_QueuingMachine.Protocol
排队机的   网络消息协议. （也就是 数据对象，以什么样的方式 编码解码，通过Socket传送）

### G0031_QueuingMachine.Server
排队机的   服务器端.  （开始 Socket 服务端，接收请求消息， 处理，然后反馈消息）

### G0031_QueuingMachine.Service
排队机的   对号管理与消息处理逻辑. （消息流水的管理）

### G0031_QueuingMachine.Test
排队机的   单元测试.






### G0051_Jigsaw.App
拼图游戏的客户端

### G0051_Jigsaw.Service
拼图游戏的业务逻辑代码

### G0051_Jigsaw.Test
拼图游戏得业务逻辑单元测试代码



### G0061_Pic_Mov
使用多个图片,实现动画处理的效果.



### G0071_BlackJack.App
21点客户端

### G0071_BlackJack.Service
21点服务逻辑

### G0071_BlackJack.Test
21点服务逻辑测试



### G0081_ImageSwitch
两个图片切换效果的处理. 包含左右、上下旋转  与 左右、上下移动。




### G0091_LianLianKan.Service
连连看后台代码

### G0091_LianLianKan.WinForm
连连看 WinForm 代码







# Visual Studio Installer 部分.



### I0001_Test.App
无功能的 WinForm 应用程序，用于测试 Visual Studio Installer 安装程序的安装过程



### I0001_Test.Setup
Visual Studio Installer 安装程序




### I0002_Test.WindowsService
简单的 Windows 服务， 用于测试 Visual Studio Installer 安装程序的安装过程


### I0002_Test.Setup

Visual Studio Installer 安装程序
在安装完 Windows 服务以后，将自动启动服务.










### IIS0010_URLrewriting
IIS URL Rewrite Module 使用的例子.






### L0001_Huffman
哈夫曼编码例子









# MEF 部分.




### MEF_0001_Service
MEF 的服务接口定义


### MEF_0001_Client
MEF 的客户端  (客户端 项目， 只引用了 MEF 的服务接口定义的项目，  没有引用实现的项目)


### MEF_0001_ServiceImpl
MEF 的服务接口的实现 （仅仅实现 接口， 不被其他项目直接引用）
编译的时候， 生成到 客户端项目的 Addin 目录下。
客户端运行的时候， 动态判断，加载实现。
这样，当业务逻辑发生变化，需要变更实现的时候，可以创建新的项目，来替换到当前的项目的 Dll， 而不用客户端重新编译一次。







# 调用其他语言部分.



### O0101_DotNetCallPython
C# 代码， 调用 Python 的例子.




### O0111_PythonCallDotNet
Python脚本，调用 C# 类库的例子.





### O0201_DotNetCallJavaScript
C# 代码， 调用 Js 的例子.





### O0301_DotNetCallJava
C# 代码， 调用 Java 类的例子.









# 设计模式部分.


### P0101_SimpleFactory
设计模式 [创建模式]中，简单工厂的例子




### P0102_FactoryMethod
设计模式 [创建模式]中，工厂方法的例子




### P0103_AbstractFactory
设计模式 [创建模式]中，抽象工厂的例子




### P0104_Singleton
设计模式 [创建模式]中，单例的例子




### P0105_Multiton
设计模式 [创建模式]中，多例的例子




### P0106_Builder
设计模式 [创建模式]中，建造者的例子




### P0107_Prototype
设计模式 [创建模式]中，原型的例子




### P0201_Adapter
设计模式 [结构模式]中，适配器 的例子




### P0202_DefaultAdapter
设计模式 [结构模式]中，缺省适配 的例子




### P0203_Composite
设计模式 [结构模式]中，合成模式 的例子




### P0204_Decorator
设计模式 [结构模式]中，装饰的例子




### P0205_Proxy
设计模式 [结构模式]中，代理的例子




### P0206_Flyweight
设计模式 [结构模式]中，享元的例子




### P0207_Facade
设计模式 [结构模式]中， 门面 / 外观 的例子




### P0208_Bridge
设计模式 [结构模式]中， 桥梁 的例子





### P0301_Immutable
设计模式 [行为模式]中，不变 的例子




### P0302_Strategy
设计模式 [行为模式]中， 策略 的例子




### P0303_TemplateMethod
设计模式 [行为模式]中， 模板方法 的例子




### P0304_Observer
设计模式 [行为模式]中， 观察者 的例子




### P0305_Iterator
设计模式 [行为模式]中， 迭代器 的例子




### P0306_ChainOfResponsibility
设计模式 [行为模式]中，责任链的例子




### P0307_Command
设计模式 [行为模式]中，命令的例子




### P0308_Memento
设计模式 [行为模式]中，备忘录的例子




### P0309_State
设计模式 [行为模式]中，状态的例子




### P0310_Visitor
设计模式 [行为模式]中，访问者的例子




### P0311_Interpreter
设计模式 [行为模式]中，解释器的例子




### P0312_Mediator
设计模式 [行为模式]中，调停者/中介者 的例子



