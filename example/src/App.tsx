import * as React from 'react';

import { StyleSheet, View, Text } from 'react-native';
import { getNavigationBarHeight } from 'react-native-android-navbar-height';

export default function App() {
  return (
    <View style={styles.container}>
      <Text>Navbar height: {getNavigationBarHeight()}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
