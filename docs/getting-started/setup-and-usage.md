# Setup and Usage

[[previous]]() &emsp;
[[next]]() &emsp;
[[chapter index]](getting-started.html) &emsp;
[[main index]](../index.html) &emsp;

These instructions will lead you to install stupyd-interpreter on your machine.

## Prerequisites

1. StuPyd is based on [**Python3**](https://www.python.org), thus you must have Python3 (3.6.0 or higher) installed first. You can check your version with:

	```	
	➜  ~ python3 -V
	```

2. The stupyd-interpreter is released on PyPI, thus you need to install **pip** first. you can see installation guide [here](https://pip.pypa.io/en/stable/installing/)

## Installation

Our PyPI page is [here](https://pypi.org/project/stupyd/). You can easily install the stupyd-interpreter with:

```
➜  ~ pip install stupyd -i https://pypi.org/simple
```

After installation, type **"stupyd"** in terminal, you should see:

```
➜  ~ stupyd
usage: stupyd [-h] filename

positional arguments:
  filename    path of source code

optional arguments:
  -h, --help  show this help message and exit
```

Now you can run StuPyd code on your machine :)

## Running the code

Let's write a simple **"demo.sp"**:

~~~c
int a, b
2 -> a
a -> b
print(a)
~~~

We can run this code by:

```
➜  ~ stupyd demo.sp
2
```
