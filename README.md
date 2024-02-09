# react-native-android-navbar-height

A library to obtain Android Navigation Bar height

## Installation

Add the following line into your package.json:

```sh
"react-native-android-navbar-height": "git+https://github.com/NikitaDudin/react-native-android-navbar-height.git#main"
```

then do `npm install`

## Usage

```js
import { getNavigationBarHeight, getNavigationBarHeightAsync } from "react-native-android-navbar-height";

// ...

// sync method, blocking JS-thread
const navigationBarHeight = getNavigationBarHeight();

// async method, non-blocking JS-thread
(async () => {
  const navigationBarHeight = await getNavigationBarHeightAsync();
})();
```

See example for more info https://github.com/NikitaDudin/react-native-android-navbar-height/blob/main/example/src/App.tsx

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## Have an issue?

Got troubles with integration? Create an issue at [Issues page](https://github.com/NikitaDudin/react-native-android-navbar-height/issues).

## License

MIT

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)
