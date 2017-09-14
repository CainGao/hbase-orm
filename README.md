#	hbase-orm 
##	JAVA封装的对于HBase的简单ORM操作.
>	实现HBase的表管理,put与get操作.直接使用javaBean自动转换Put. result转换javaBean

>	对于HBase数据库的管理直接在代码层面做一些限制..

>		面临的主要问题是...同一个表由好几个人做put操作.每个人都读取自己的那一份数据.但是最后hbase表中的列数量较多.难以整理,甚至某些人put上了什么数据都不知道.直接使用类似与ORM的方式对HBase表进行管理,能够直接在JavaBean中管理插入的数据,从而规范插入数据的列簇与列的名称.