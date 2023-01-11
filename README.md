[![Android Build](https://github.com/jawnpaul/patmore-android/actions/workflows/android_build.yml/badge.svg)](https://github.com/odogwudev/AI-INSPIRE/actions/workflows/android_build.yml)
# AI-INSPIRE
Tiktok CHallenge let ai draw from description

The application consumes data from the [OPENAI](https://beta.openai.com/)

## Table of Contents

- [Architecture](#architecture)
- [Libraries](#libraries)
- [Process](#process)
- [Testing](#testing)
- [Organisation](#organisation)
- [Extras](#extras)
- [Demo](#demo)


## Architecture 
MVVM (Model - View - ViewModel) Clean Architecture


##Libraries
--TODO

## Testing
--TODO


## Extras
The project uses ktlint to enforce proper code style. Github actions handles continous integration, and runs ktlint and unit tests.



## Installation

Minimum Api Level: 23

compileSdkVersion: 33

Build System: [Gradle](https://gradle.org/)

1. Get a free OPEN AI credentials at [https://beta.openai.com/account/api-keys](https://beta.openai.com/account/api-keys)
2 Clone the repo
   ```sh
   git clone https://github.com/odogwudev/AI-INSPIRE.git
   ```
3 Enter your keys in `local.properties`
   `sh
   apiKey="Enter your Token"
    `

## Demo
Find below screenshots of the application

|<img src="https://raw.githubusercontent.com/odogwudev/AI-INSPIRE/master/photos/photo1.png" width=200/>|
|:----:|:----:|

|<img src="https://raw.githubusercontent.com/odogwudev/AI-INSPIRE/master/photos/photo2.png" width=200/>|<img src="https://user-images.githubusercontent.com/29982834/188142088-ad44a9c1-e817-42b9-9e31-dc7f596c3da4.png" width=200/>|
|:----:|:----:|

|<img src="https://raw.githubusercontent.com/odogwudev/AI-INSPIRE/master/photos/photo3.png" width=200/>|<img src="https://user-images.githubusercontent.com/29982834/188142311-1fea4204-cb68-4a3c-b3ac-60de6b54ca40.png" width=200/>|
|:----:|:----:|

## License

MIT

