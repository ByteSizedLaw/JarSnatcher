# ☕ JarSnatcher

## 💡 Why This Exists
This project was born out of a moment of panic - and then purpose.

I lost my original Java source files and was left with nothing but the compiled `.jar`. No backups. No version control. Just the jar. I needed to decompile it to rebuild what I had lost. So I wrote this tool to help myself, and then realized: _I'm probably not the only one._

If you've ever found yourself staring at a jar file, wishing you could turn back time or just peek inside - this tool is for you.

## 🔧 What It Does

JarDecompiler is a simple Java class that:
- ✅ Accepts a `.jar` file as input
- 🔍 Decompiles the contained `.class` files
- 📁 Outputs readable `.java` source files
- 🛠️ Helps you recover, inspect, or learn from compiled Java code

It’s lightweight, intuitive, and built with empathy for developers who just need a lifeline.
## 🚀 Getting Started

### 1. Clone the repo
```bash
git clone https://github.com/ByteSizedLaw/JarSnatcher.git
```
### 2. Compile the class
```bash
javac JarDecompiler.java
```
### 3. Run my decompiler
```bash
java JarDecompiler /path/to/input.jar /path/to/output/directory
```

## ❤️ Who This Is For
Developers who lost their source code
Curious learners exploring how Java bytecode works
Anyone who needs to reverse-engineer a .jar for *legitimate* reasons
This tool is shared in the spirit of collaboration and recovery—not exploitation. Please use it responsibly.

## ⚖️ Legal Disclaimer
This tool is intended solely for educational and ethical purposes.
JarSnatcher was created to help developers recover lost source code from their *own* `.jar` files. It is **not** intended for use in unauthorized reverse engineering, intellectual property infringement, or any activity that violates applicable laws or software licenses.
By using this tool, you agree to take full responsibility for how you use it. I (The creator) am **not liable** for any misuse, damage, or legal consequences resulting from its use.
Please respect the rights of software authors and use this tool responsibly.
