import React, { useState, useEffect } from 'react';
import { SafeAreaView, StyleSheet, View, Text } from 'react-native';
import { Colors } from 'react-native/Libraries/NewAppScreen';

//Tests your library here
const App = () => {

  return (
      <SafeAreaView style={styles.sectionContainer}>
          <Text style={styles.sectionTitle}>BoilerPlate</Text>
      </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  sectionContainer: {
    flex: 1,
    paddingHorizontal: 24,
    justifyContent: 'center',
  },
  sectionTitle: {
    textAlign: 'center',
    fontSize: 24,
    fontWeight: '600',
    color: Colors.black,
  }
});

export default App;
