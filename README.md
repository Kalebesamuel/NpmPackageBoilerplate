## How usage this boilerplate?

Edit these files so that they apply to your npm package:

Edit the package.json
Edit index.js in the root directory
Edit the READEME.md
Edit .gitignore and .npmignore

Place the gifs / banner of your npm package in the assets folder

In the example folder:
Edit your package.json, if necessary

Edit rootProject.name in settings.gradle

Build your library inside the android folder

Tips:
Use Android Studio to edit the .java files and VSCode for the rest.

___
### README.me example

//Create your badges using:
https://shields.io/category/other

//Edit your README.md using:
https://dillinger.io/

//Badges
![npm (scoped)](https://img.shields.io/npm/v/@react_native_libraries/react-native-network-state-listener)
![npm](https://img.shields.io/npm/dw/@react_native_libraries/react-native-network-state-listener)

# react-native-network-state-listener
![banner](https://raw.githubusercontent.com/ReactNativeLibraries/NetworkStateListener/master/assets/banner.png)

## About

This library ....


## Example
![example](https://github.com/ReactNativeLibraries/NetworkStateListener/blob/master/assets/networkStateListener.gif?raw=true)


## Installation

If using yarn:

```
yarn add your library-name
```

If using npm:

```
npm i your library-name
```

## Usage

```javascript
import React, { useState, useEffect } from 'react';
import { SafeAreaView, StyleSheet, View, Text } from 'react-native';
import { Colors } from 'react-native/Libraries/NewAppScreen';

//Add Import
import NetworkListener from '@react_native_libraries/react-native-network-state-listener';

const App = () => {
  const [networkStatus, setNetworkStatus] = useState(true);

  useEffect(() => {
    (async () => {
      //Start listener
      await NetworkListener.startListener();
        
      //Set callback for changes in network status 
      NetworkListener.onNetworkStateChange((status) => {
        console.log("+===STATUS: ", status);
        setNetworkStatus(status);
      })
    })();
    
    //Remove listener when app destroy
    return () => NetworkListener.stopListener();
  }, []);

  return (
      <SafeAreaView style={styles.sectionContainer}>
          <Text style={styles.sectionTitle}>Network Status:</Text>
          {networkStatus && <Text style={styles.sectionTitle}>Connected</Text>}
          {!networkStatus && <Text style={styles.sectionTitle}>Disconnected</Text>}
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
```

## Documentation
### Network State Listener

| Name | Description |
|------------------|--------------------------------------------------------------------------|
| startListener | starts the network state listener. |
| stopListener | Stops the network state listener, it must be called when the component unmount. |
| onNetworkStateChange | Defines the callback for changes in the state of the network, returns true if there is a connection, false otherwise. |

## Contributing
Pull requests are always welcome! Feel free to open a new GitHub issue for any changes that can be made.

**Working on your first Pull Request?** You can learn how from this *free* series [How to Contribute to an Open Source Project on GitHub](https://egghead.io/series/how-to-contribute-to-an-open-source-project-on-github)

## Author
Your Name

## License
[MIT](./LICENSE)

___

  