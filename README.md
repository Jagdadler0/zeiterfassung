# frontend

This template should help get you started developing with Vue 3 in Vite.

## Recommended IDE Setup

[VSCode](https://code.visualstudio.com/) + [Volar](https://marketplace.visualstudio.com/items?itemName=Vue.volar) (and disable Vetur).

## Customize configuration

See [Vite Configuration Reference](https://vite.dev/config/).

## Project Setup
To setup your project you need to do the following<br>
For the frontend:
```sh
cd frontend/
npm install
```
### Developing
In order to see the changes you need to run the following commands,<br>
For starting 
```sh
npm run dev:all
```

### Build for Production
In order to build the Application for 
```sh
npm run build
npm run build:electron
```

### Lint with [ESLint](https://eslint.org/)

```sh
npm run lint
```
### Used packages
> - Vuejs
> - Electron
> - concurrently
> - electron-builder

# backend
## mariadb
> In order to setup your mariadb you need to:
> ### Windows
> - install mariadb from their [website](https://mariadb.org/download/?t=mariadb&p=mariadb&r=11.7.2&os=windows&cpu=x86_64&pkg=msi&mirror=hs-esslingen)
> - go to where it's installed
> ```sh
> cd 'C:\Program Files\MariaDB 11.7\bin'
> ```
> **Installing MariaDB on your device**
> ```sh
> npm install mariadb
> ```
> **Login to root**
> ```sh
> .\mysql -u root -p
> ```
> <br>
>
> ### Linux
> 
> ```sh
> apt update
> sudo apt install mariadb-server
> sudo mysql_secure_installation
> ```


### Creating a Database
```sql
CREATE DATABASE databasename;
```