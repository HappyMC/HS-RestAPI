# HappyShop *Rest-API*
<a href="https://github.com/HappyMC/HS-RestAPI/blob/master/LICENSE"><img alt="License: MIT" src="https://img.shields.io/github/license/Naereen/StrapDown.js.svg"></a>

*HappyShop REST-API* is a Rest-API for communicating with the HappyShop API.\
Using [Fuel](https://github.com/kittinunf/fuel) for HTTP communication, we natively have support for asynchronous requests and coroutines.

Currently we have only one module available
* [`hs-kotlin`](https://github.com/HappyMC/HS-RestAPI/tree/master/hs-kotlin) to the Kotlin language

## Dependencies
Depending on the module you are going to use it will need some dependencies to work as expected.

### Kotlin
| Package | Description |
| ------ | ------------ |
| [`fuel`](https://github.com/kittinunf/fuel) | Core |
| [`fuel-coroutines`](https://github.com/kittinunf/fuel/blob/master/fuel-coroutines) | *KotlinX*: Execution with coroutines |
| [`fuel-gson`](https://github.com/kittinunf/fuel/blob/master/fuel-gson) | Response deserialization |

## Coroutines
*HappyShop REST-API* was developed using [Fuel](https://github.com/kittinunf/fuel), it has native support for [`kotlinx.coroutines`](https://github.com/kotlin/kotlinx.coroutines) and you can use them.

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
