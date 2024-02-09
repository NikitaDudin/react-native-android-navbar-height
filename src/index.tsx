import { NativeModules, Platform } from 'react-native';

const LINKING_ERROR =
  `The package 'react-native-android-navbar-height' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo Go\n';

// @ts-expect-error
const isTurboModuleEnabled = global.__turboModuleProxy != null;

const AndroidNavbarHeightModule = isTurboModuleEnabled
  ? require('./NativeAndroidNavbarHeight').default
  : NativeModules.AndroidNavbarHeight;

const AndroidNavbarHeight = AndroidNavbarHeightModule
  ? AndroidNavbarHeightModule
  : new Proxy(
      {},
      {
        get() {
          throw new Error(LINKING_ERROR);
        },
      }
    );

export function getNavigationBarHeightAsync(): Promise<number> {
  return AndroidNavbarHeight.getNavigationBarHeightAsync();
}

export function getNavigationBarHeight(): number {
  return AndroidNavbarHeight.getNavigationBarHeight();
}
