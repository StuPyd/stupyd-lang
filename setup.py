#-*- encoding: UTF-8 -*-
from setuptools import setup, find_packages

VERSION = '0.0.1'

with open("README.md", "r") as fh:
    long_description = fh.read()

setup(
    name='stupyd',
    version=VERSION,
    author='stupyd group',
    author_email='sunmch15@foxmail.com',

    description="official stupyd programming language package",
    long_description=long_description,
    long_description_content_type="text/markdown",
    url='https://github.com/StuPyd/stupyd-lang',

    packages=find_packages(),
    include_package_data=True,
    zip_safe=True,
    install_requires=[
        'antlr4-python3-runtime >= 4.7.1',
    ],

    classifiers=[
        "Programming Language :: Python :: 3",
    ],

    keywords='python stupyd education programming language',

    license='Apache',

    entry_points={
        'console_scripts':[
            'stupyd = stupyd.main:runner',
            'spd = stupyd.main:debugger'
        ]
    },
)
