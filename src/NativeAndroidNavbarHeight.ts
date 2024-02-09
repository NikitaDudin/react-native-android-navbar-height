import type { TurboModule } from 'react-native';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
  getNavigationBarHeightAsync(): Promise<number>;
  getNavigationBarHeight(): number;
}

export default TurboModuleRegistry.getEnforcing<Spec>('AndroidNavbarHeight');
