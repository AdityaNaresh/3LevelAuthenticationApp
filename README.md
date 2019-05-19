# 3LevelAuthenticationApp
[![forthebadge](https://forthebadge.com/images/badges/built-for-android.svg)](http://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](http://forthebadge.com)

This App is an authentication system that validates user for accessing the system only when they have input correct password. The App involves three levels of user authentication. This App is aimed to achieve the highest security in authenticating users.

## Features
* Users would be given a registration form that has to be filled with required details.
* Next users would be asked to set password for first level, second level and third level subsequently.
* After the passwords are set for the three level users can now login into the system.
* While login the system will ask for the first level password. On entering correct password, second level password is asked and then third one.
* After the user has provided correct password in the third level, he gets authenticated and can now access the system. 

## Levels of authentication
* First Level: The first level is a conventional password system i.e. text based password or a password phrase. Users would have to set a text password initially based on some specifications.
* Second Level: The second level is a graphical password method where users have to set password based on some color combinations through RGB button combinations.
* Third Level: The third level is an image based password where users can upload their desired image into the system and then create password by segmenting it and assigning them serial numbers. 
* Additional layer of authentication has been provided at the end using google's reCaptcha API(Humans v/s Bots).

### Install 

```sh
$ git clone https://github.com/rajatkhanna1999/3LevelAuthenticationApp.git
```
Then open in Android Studio.

#### Screenshots
<img src="https://user-images.githubusercontent.com/31288037/57477435-4ba17e80-72b6-11e9-9013-7322660c6f1b.jpeg" width="340" height="567">
<img src="https://user-images.githubusercontent.com/31288037/57477477-5fe57b80-72b6-11e9-9f23-15783bf37b00.jpeg" width="340" height="567">
<img src="https://user-images.githubusercontent.com/31288037/57477496-6c69d400-72b6-11e9-85b9-9331dcf9ff3a.jpeg" width="340" height="567">
<img src="https://user-images.githubusercontent.com/31288037/57477516-77246900-72b6-11e9-91a9-153dc66ebc02.jpeg" width="340" height="567">
<img src="https://user-images.githubusercontent.com/31288037/57477539-85728500-72b6-11e9-8d0c-5b656cbfa1b7.jpeg" width="340" height="567">
<img src="https://user-images.githubusercontent.com/31288037/57477565-928f7400-72b6-11e9-8fb0-ef806972ff9f.jpeg" width="340" height="567">
<img src="https://user-images.githubusercontent.com/31288037/57477592-a20ebd00-72b6-11e9-8c1a-30174136034e.jpeg" width="340" height="567">

