# TodoWebApplication

## Description　－　説明
Create a Web application that manages the Todo list in Java.

JavaでTodoリストを管理するWebアプリケーションを作成します。

## Creation procedure (for recording)　－　作成手順(メモ用)
 1. Create a template with [Spring Initializr](https://start.spring.io/).
 2. After unzipping the zip file, place it in a suitable folder.
 3. Create a database with MySQL.
 4. Describe in /src/main/resources/application.properties as follows.
  ```java:application.properties
  spring.datasource.url=jdbc:mysql://localhost:xxxx(PortNumber)/yyyy(DBname)?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
  spring.datasource.username= // username
  spring.datasource.password= // password
  spring.jpa.database=MYSQL
  spring.jpa.hibernate.ddl-auto=update
  ```

 1. [Spring Initializr](https://start.spring.io/)でテンプレートを作成する。
 2. zipファイルを解凍後、適当なフォルダにおく。
 3. MySQLでデータベースを作成する。
 4. /src/main/resources/application.properties に以下のように記述する。
  ```java:application.properties
  spring.datasource.url=jdbc:mysql://localhost:xxxx(PortNumber)/yyyy(DBname)?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
  spring.datasource.username= // username
  spring.datasource.password= // password
  spring.jpa.database=MYSQL
  spring.jpa.hibernate.ddl-auto=update
  ```
