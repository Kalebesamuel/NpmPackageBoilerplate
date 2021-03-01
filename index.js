import {
    NativeModules
} from 'react-native';

const { Module_Name } = NativeModules;

class YourClass {

    constructor() {

    }

    //=====================================================================================
    /** Documentation
     * 
     */
    method1() {
            //....
            return Module_Name.callNativeModule();
    }

    //=====================================================================================
    /** Documentation
     * @param {function} callback 
     * @returns {boolean} returns true if there is a connection, false otherwise 
     */
    method2(callback) {
        //....
    }

}

export default new YourClass();
