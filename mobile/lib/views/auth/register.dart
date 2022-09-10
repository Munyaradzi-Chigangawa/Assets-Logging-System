import 'package:flutter/material.dart';
import 'package:flutter/src/foundation/key.dart';
import 'package:flutter/src/widgets/framework.dart';
import 'package:mobile/views/auth/login.dart';

class Register extends StatefulWidget {
  const Register({Key? key}) : super(key: key);

  @override
  State<Register> createState() => _RegisterState();
}

class _RegisterState extends State<Register> {
  @override
  Widget build(BuildContext context) {
     return Scaffold(
        appBar: AppBar(),
        body: SingleChildScrollView(
            child: Column(
          mainAxisAlignment: MainAxisAlignment.start,
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            const SizedBox(),
            const Padding(
              padding: EdgeInsets.fromLTRB(20, 15, 20, 8),
              child: Text(
                'Register',
                style: TextStyle(
                    color: Colors.black,
                    fontWeight: FontWeight.w600,
                    fontSize: 30),
              ),
            ),
            const Padding(
              padding: EdgeInsets.symmetric(horizontal: 20.0),
              child: Text(
                'Please sign up to continue.',
                style: TextStyle(fontWeight: FontWeight.w400, fontSize: 13),
              ),
            ),
            Padding(
              padding: const EdgeInsets.symmetric(horizontal: 20.0),
              child: Container(
                margin: const EdgeInsets.symmetric(vertical: 10.0),
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    const SizedBox(height: 10,),
                    const Text(
                      'E-mail',
                      style: TextStyle(
                          fontWeight: FontWeight.w400,
                          fontSize: 13,
                          color: Colors.black),
                    ),
                    const SizedBox(
                      height: 10,
                    ),
                    TextField(
                      style: (const TextStyle(
                          color: Colors.black, fontWeight: FontWeight.w400)),
                      keyboardType: TextInputType.emailAddress,
                      cursorColor: Colors.black,
                      obscureText: false,
                      decoration: InputDecoration(
                        border: InputBorder.none,
                        filled: true,
                        prefixIcon: Image.asset('assets/img/icon_email.png'),
                        focusedBorder: const OutlineInputBorder(
                          borderSide: BorderSide(width: 2.0),
                          borderRadius: BorderRadius.all(Radius.circular(20.0)),
                        ),
                      ),
                      // onChanged: (value) {
                      //   email = value;
                      // },
                    ),
                    const SizedBox(height: 10,),
                    Container(
                  margin: const EdgeInsets.symmetric(vertical: 10.0),
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: <Widget>[
                      const Text(
                        'Password',
                        style: TextStyle(
                            fontWeight: FontWeight.w300,
                            fontSize: 13,
                            color: Colors.black),
                      ),
                     const  SizedBox(
                        height: 10,
                      ),
                      TextField(
                        style: (const TextStyle(
                            color: Colors.black, fontWeight: FontWeight.w400)),
                        obscureText: true,
                        cursorColor: Colors.black,
                        decoration: InputDecoration(
                          border: InputBorder.none,
                          filled: true,
                          prefixIcon:
                              Image.asset('assets/img/icon_lock.png'),
                          focusedBorder: const OutlineInputBorder(
                            borderSide: BorderSide(width: 2.0),
                            borderRadius:
                                BorderRadius.all(Radius.circular(20.0)),
                          ),
                        ),
                        // onChanged: (value) {
                        //   password = value;
                        // },
                      ),
                    ],
                  ),
                ),
                const SizedBox(height: 20,),

                 Padding(
                  padding:
                      const EdgeInsets.only(left: 20, right: 20, bottom: 0),
                  child: SizedBox(
                    height: 45,
                    child: TextButton(
                      style: ButtonStyle(
                          backgroundColor: MaterialStateProperty.resolveWith(
                              (states) => Theme.of(context).primaryColor)),
                      onPressed: () {
                        // Add login code
                        // setState(() {
                        //  isLoading = true;
                        // });
                        // try {
                        //   final user = await _auth.signInWithEmailAndPassword(
                        //       email: email, password: password);
                        //   // ignore: unnecessary_null_comparison
                        //   if (user != null) {
                        //     Navigator.push(
                        //         context,
                        //         MaterialPageRoute(
                        //             builder: (context) => Home()));
                        //   }
                        //   setState(() {
                            
                        //   });
                        // } catch (e) {
                        //   print(e);
                        // }
                      },
                      child: Row(
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: const [
                          Text('Login',
                              style:
                                  TextStyle(fontSize: 16, color: Colors.white)),
                        ],
                      ),
                    ),
                  ),
                ),
               
                const SizedBox(
                  height: 25,
                ),
                Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                   const Text(
                      "Already have an account?",
                      style: TextStyle(
                          color: Colors.black,
                          fontWeight: FontWeight.w500,
                          fontSize: 13),
                      ),
                    

                    TextButton(
                      onPressed: () {
                        Navigator.push(
                            context,
                            MaterialPageRoute(
                                builder: (context) => const Login()));
                      },
                      child: const Text(
                        'Sign In',
                        style: TextStyle(color: Colors.black),
                      ),
                    )
                  ],
                ),
                  ],
                ),  
              ),
            ),
          ],
        )
      )
    );
    
  }
}