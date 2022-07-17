import 'package:flutter/material.dart';
import 'package:mobile/constants/theme/custom_theme.dart';
import 'package:mobile/views/welcome_page.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: CustomTheme.lightTheme(context),
      home: const WelcomeScreen(),
      debugShowCheckedModeBanner: false,
    );
  }
}

