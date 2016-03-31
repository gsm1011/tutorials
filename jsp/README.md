# Introduction

JSP is a powerfull web development technology for developing dynamic
content web applications. 

# Newbie tasks

## Configure the JSP development environment 

The development environment involves the configuration of JDK and tomcat
which is used for deploying the code. i am assuming to use the simple text
editor emacs as the development environment. You can also chose to use
other dev tools such as eclipse, IntelliJ etc. 

## Develop simple JSP program 

JSP supports multiple annotation for different types of statements. 

- Declarations are used to declare variables 

``` jsp
<%! declaration; [declaration]* ... %>
```

- Expressions are statement that will be evalated and converted to string
  and thus displayed on the web page. 
  
  ``` jsp 
  <%= (new java.util.Date()).toLocaleString() %>
  ```

## Deploy and test the program 
