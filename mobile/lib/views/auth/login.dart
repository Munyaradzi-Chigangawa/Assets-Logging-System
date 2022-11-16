// ignore_for_file: library_private_types_in_public_api

import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
// ignore: depend_on_referenced_packages
import 'package:http/http.dart' as http;

import '../../constants/button.dart';
import '../../models/user.dart';
import '../dashboard.dart';
import 'register.dart';

class Login extends StatefulWidget {
  const Login({Key? key}) : super(key: key);

  @override
  _LoginState createState() => _LoginState();
}

class _LoginState extends State<Login> {
  final _formKey = GlobalKey<FormState>();
  User user = User("", "", "", "", "", "");
  String url = "http://192.168.1.35:8080/api/v1/people-login";

  Future save() async {
    var res = await http.post(Uri.parse(url),
        headers: {'Content-Type': 'application/json'},
        body: json.encode({'email': user.email, 'password': user.password}));
    if (res.body != null) {
      // ignore: use_build_context_synchronously
      Navigator.pushReplacement(
          context,
          MaterialPageRoute(
            builder: (context) => const Dashboard(),
          ));
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: SingleChildScrollView(
        child: Form(
            key: _formKey,
            child: Column(
              children: [
                Padding(
                  padding: const EdgeInsets.all(16.0),
                  child: Column(
                    children: [
                      const SizedBox(
                        height: 100,
                      ),
                      Text("Login",
                          style: GoogleFonts.poppins(
                            fontWeight: FontWeight.bold,
                            fontSize: 50,
                          )),
                      const SizedBox(
                        height: 25,
                      ),
                      Align(
                        alignment: Alignment.topLeft,
                        child: Text(
                          "Email",
                          style: GoogleFonts.poppins(
                            // fontWeight: FontWeight.bold,
                            // fontSize: 25,
                          ),
                        ),
                      ),
                      TextFormField(
                        controller: TextEditingController(text: user.email),
                        onChanged: (val) {
                          user.email = val;
                        },
                        validator: (value) {
                          if (value!.isEmpty) {
                            return 'Email is Empty';
                          }
                          return null;
                        },
                        // style: const TextStyle(fontSize: 20),
                        decoration: const InputDecoration(
                            errorStyle:
                                TextStyle( color: Colors.black),
                            border: OutlineInputBorder(
                                )),
                      ),
                      const SizedBox(
                        height: 25,
                      ),
                      Align(
                        alignment: Alignment.topLeft,
                        child: Text(
                          "Password",
                          style: GoogleFonts.poppins(
                            // fontWeight: FontWeight.bold,
                            // fontSize: 25,
                          ),
                        ),
                      ),
                      TextFormField(
                        obscureText: true,
                        controller: TextEditingController(text: user.password),
                        onChanged: (val) {
                          user.password = val;
                        },
                        validator: (value) {
                          if (value!.isEmpty) {
                            return 'Password is Empty';
                          }
                          return null;
                        },
                       
                        decoration: const InputDecoration(
                            errorStyle:
                                TextStyle( color: Colors.black),
                            border: OutlineInputBorder(
                                )),
                      ),
                      const SizedBox(
                        height: 25,
                      ),
                      Center(
                        child: InkWell(
                          onTap: () {
                            Navigator.push(
                                context,
                                MaterialPageRoute(
                                    builder: (context) => const Register()));
                          },
                          child: Text(
                            "Don't have Account ?",
                            style: GoogleFonts.poppins(
                              fontWeight: FontWeight.normal,
                            
                            ),
                          ),
                        ),
                      )
                    ],
                  ),
                ),
                const SizedBox(
                  height: 25,
                ),
                SizedBox(
                  child: BigButton(
                child: Text('Sign In', style: TextStyle(color: Theme.of(context).cardColor, fontWeight: FontWeight.w400),
                ),
                onPressed: () {
                  if (_formKey.currentState!.validate()) {
                          save();
                        }
                },
              ),
                ),
                
              ],
            )),
      ),
    );
  }
}
