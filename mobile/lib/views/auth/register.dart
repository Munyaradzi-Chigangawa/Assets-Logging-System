import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
// ignore: depend_on_referenced_packages
import 'package:http/http.dart' as http;

import '../../constants/button.dart';
import '../../models/user.dart';

class Register extends StatefulWidget {
  const Register({Key? key}) : super(key: key);

  @override
  // ignore: library_private_types_in_public_api
  _RegisterState createState() => _RegisterState();
}

class _RegisterState extends State<Register> {
  final _formKey = GlobalKey<FormState>();
  User user = User("", "", "", "", "", "");
  String url = "http://192.168.1.35:8080/api/v1/add-people";

  Future save() async {
    var res = await http.post(Uri.parse(url),
        headers: {'Content-Type': 'application/json'},
        body: json.encode({
          'email': user.email,
          'password': user.password,
          'name': user.name,
          'designation': user.designation,
          'department': user.department
        }));
    if (res.body != null) {
      // ignore: use_build_context_synchronously
      Navigator.pop(context);
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(),
      body: SafeArea(
        child: SingleChildScrollView(
          child: Form(
              key: _formKey,
              child: Column(
                children: [
                  Padding(
                    padding: const EdgeInsets.all(16.0),
                    child: Column(
                      children: [
                        const SizedBox(
                          height: 10,
                        ),
                        Text("Register",
                            style: GoogleFonts.poppins(
                              fontWeight: FontWeight.bold,
                              fontSize: 40,
                            )),
                        const SizedBox(
                          height: 10,
                        ),
                        Align(
                          alignment: Alignment.topLeft,
                          child: Text(
                            "Full Name",
                            style: GoogleFonts.poppins(
                              // fontWeight: FontWeight.bold,
                              
                            ),
                          ),
                        ),

                        // Full Name 
                        TextFormField(
                          controller: TextEditingController(text: user.name),
                          onChanged: (val) {
                            user.name = val;
                          },
                          validator: (value) {
                            if (value!.isEmpty) {
                              return 'Full Name is Empty';
                            }
                            return null;
                          },
                          // style: const TextStyle(fontSize: 25),
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
                            "Email",
                            style: GoogleFonts.poppins(
                              // fontWeight: FontWeight.bold,
  
                            ),
                          ),
                        ),

                        // Email
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
                         
                          decoration: const InputDecoration(
                              errorStyle:
                                  TextStyle(color: Colors.black),
                              border: OutlineInputBorder(
                                  )),
                        ),
                        const SizedBox(
                          height: 25,
                        ),
                        Align(
                          alignment: Alignment.topLeft,
                          child: Text(
                            "Designation",
                            style: GoogleFonts.poppins(
                              // fontWeight: FontWeight.bold,
                            
                            ),
                          ),
                        ),

                        // Designation
                        TextFormField(
                          controller:
                              TextEditingController(text: user.designation),
                          onChanged: (val) {
                            user.password = val;
                          },
                          validator: (value) {
                            if (value!.isEmpty) {
                              return 'Designation is Empty';
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
                        Align(
                          alignment: Alignment.topLeft,
                          child: Text(
                            "Password",
                            style: GoogleFonts.poppins(
                             
                            ),
                          ),
                        ),

                        // Password
                        TextFormField(
                          obscureText: true,
                          controller:
                              TextEditingController(text: user.password),
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
                                  TextStyle(color: Colors.black),
                              border: OutlineInputBorder(
                                  )),
                        ),
                        const SizedBox(
                          height: 25,
                        ),
                        Center(
                          child: InkWell(
                            onTap: () {
                              Navigator.pop(context);
                            },
                            child: Text(
                              "Already have Account ?",
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
                    height: 10,
                  ),
                  SizedBox(
                    child: BigButton(
                      child: Text(
                        'Register',
                        style: TextStyle(
                            color: Theme.of(context).cardColor,
                            fontWeight: FontWeight.w400),
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
      ),
    );
  }
}
