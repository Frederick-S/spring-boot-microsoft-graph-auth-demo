# spring-boot-microsoft-graph-auth-demo [![Build status](https://ci.appveyor.com/api/projects/status/0on170mi64kt71td/branch/master?svg=true)](https://ci.appveyor.com/project/Frederick-S/spring-boot-microsoft-graph-auth-demo/branch/master) [![CircleCI](https://circleci.com/gh/Frederick-S/spring-boot-microsoft-graph-auth-demo.svg?style=shield)](https://circleci.com/gh/Frederick-S/spring-boot-microsoft-graph-auth-demo) [![codebeat badge](https://codebeat.co/badges/ceb4c495-6f44-4f7d-a366-c9b5a294e9d1)](https://codebeat.co/projects/github-com-frederick-s-spring-boot-microsoft-graph-auth-demo-master) [![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)](https://ktlint.github.io/)

## Steps to Run
1. Register your Azure AD v2.0 app.  
    - Navigate to the [App Registration Portal](https://identity.microsoft.com). 
    - Go to the the `My Apps` page, click `Add an App`, and name your app.  
    - Set a platform by clicking `Add Platform`, select `Web`, and add a Redirect URI of ```http://localhost:8080/login```.
    - Click "Generate New Password" and record your Consumer Secret.  

2. Clone the code. 
    ```
    git clone https://github.com/Frederick-S/spring-boot-microsoft-graph-auth-demo
    ```

3. Rename `application-dev.template.yml` to `application-dev.yml`, then add your Application/Client ID and Consumer Secret to it.

4. Run and navigate to `http://localhost:8080`.
