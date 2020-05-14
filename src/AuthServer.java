public class AuthServer {
    // ** CLASS PRIVATES ** //
    // Stored Secret Between Auth and TGS
    // Incoming connection queue


    // ** CLASS PUBLIC METHODS ** //
    // Checking the database for Auth
    // Socket connection handling
    // Key & Password Deciphering
    // Key Generation

    // ** CLASS PRIVATE METHODS ** //
    //
}

// ** AUTH SERVER DRIVER ** //
// A listener for Identifying connections
// Upon a received connection the auth server will decipher the password and Key
// The key will decipher into a json datalist of user information
// IF deciphered key password pair results in JSON data format:
//      JSON data list will be used to query the database for authorization
// ELSE: Return A Login Error of KEY PASSWORD PAIR not correct

// Then two messages are generated.
//      1. {Key*AT, nonce*a, time stamp, lifespan of message, TGS}Key*AS
//	    2. {Key*AT, lifespan of message, A}Key*ST

// These two are passed back and AUTH Server does not maintain state