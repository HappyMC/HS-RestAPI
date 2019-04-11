# HappyShop REST-API
![GitHub contributors][contributors-shield]
![Stars][stars-shield]
[![MIT License][license-shield]][license-url]

> HappyShop REST-API is used to communicate with the HappyShop API

This project currently supports 1 language:
* **hs-kotlin** - API in Kotlin with Coroutines support

## Dependencies
Depending on the module you are going to use it will need some dependencies to work as expected.

### Kotlin
The Kotlin module was developed using [Fuel](https://github.com/kittinunf/fuel), it has native support for [`kotlinx.coroutines`](https://github.com/kotlin/kotlinx.coroutines) and you can use them.

| Package | Description |
| ------ | ------------ |
| [`fuel`](https://github.com/kittinunf/fuel) | Core dependency |
| [`fuel-coroutines`](https://github.com/kittinunf/fuel/blob/master/fuel-coroutines) | *KotlinX*: Execution with coroutines |
| [`fuel-kotlinx-serialization`](https://github.com/kittinunf/fuel/blob/master/fuel-kotlinx-serialization) | Response deserialization |
| [`kotlin-test`](https://kotlinlang.org/api/latest/kotlin.test/index.html) | For tests only |
| [`kotlin-test-junit5`](https://kotlinlang.org/api/latest/kotlin.test/kotlin.test.junit5/index.html) | For tests only |

## Contributing
The best way to submit a patch is to send us a pull request. Before submitting the pull request, make sure all existing tests are passing, and add the new test if it is required.

If you want to add new functionality, please file a new proposal issue first to make sure that it is not in progress already. If you have any questions, feel free to create a question issue.

## License
HappyShop is released under [MIT](https://github.com/HappyMC/HS-RestAPI/blob/master/LICENSE) license.

## Authors
Thanks to all who help keep this project going.\
<br/>
Maintained by
* [DevNatan](https://github.com/DevNatan)

## Stay In Touch
Join our Discord server: https://discord.gg/hJETZXc

[contributors-shield]: https://img.shields.io/github/contributors/HappyMC/HS-RestAPI.svg
[license-shield]: https://img.shields.io/badge/license-MIT-blue.svg?color=1bcc1b
[license-url]: https://choosealicense.com/licenses/mit
[stars-shield]: https://img.shields.io/github/stars/HappyMC/HS-RestAPI.svg?color=1bcc1b
