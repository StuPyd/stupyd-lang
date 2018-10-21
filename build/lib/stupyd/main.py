import argparse
import sys
from antlr4 import *
from .compiler.stuPydLexer import stuPydLexer
from .compiler.stuPydParser import stuPydParser
from .compiler.extendListener import extendListener
from .interpreter.stupydInterpreter import Interpreter
from .interpreter.stupydShell import stupydShell

def parse(filename):
    '''input source file, output code_obj, num_array and id_array'''
    instream = FileStream(filename)
    lexer = stuPydLexer(instream)
    token_stream = CommonTokenStream(lexer)
    parser = stuPydParser(token_stream)
    tree = parser.simple_stmt()
    walker = ParseTreeWalker()
    listener = extendListener()
    walker.walk(listener, tree)

    code_obj = listener.code_obj
    num_array = listener.valueTable
    id_array = listener.varTable

    result = {
        'code_obj': code_obj,
        'num_array': num_array,
        'id_array': id_array
    }

    return result



def runner():
    APP_DESC = """The stupyd-interpreter.\n"""
    print(APP_DESC)

    if len(sys.argv) == 1:
        sys.argv.append('--help')

    parser = argparse.ArgumentParser()
    parser.add_argument('filename', help="path of source code")

    args = parser.parse_args()
    filename = args.filename

    info = parse(filename)
    code_obj = info['code_obj']
    num_array = info['num_array']
    id_array = info['id_array']

    stupyd = Interpreter(code_obj, num_array, id_array)
    stupyd.run_code()
    # stupyd.dis()

def debugger():
    # APP_DESC = """stupyd-debugger"""
    # print(APP_DESC)

    if len(sys.argv) == 1:
        sys.argv.append('--help')

    parser = argparse.ArgumentParser()
    parser.add_argument('filename', help="path of source code")

    args = parser.parse_args()
    filename = args.filename

    info = parse(filename)
    code_obj = info['code_obj']
    num_array = info['num_array']
    id_array = info['id_array']

    stupyd = Interpreter(code_obj, num_array, id_array)
    shell = stupydShell(stupyd)

    shell.cmdloop()


# def debugger():
#     APP_DESC = """stupyd-debugger"""
#     print(APP_DESC)
#
#     if len(sys.argv) == 1:
#         sys.argv.append('--help')
#
#     parser = argparse.ArgumentParser()
#     parser.add_argument('filename', help="path of source code")
#
#     args = parser.parse_args()
#     filename = args.filename
#
#     info = parse(filename)
#     code_obj = info['code_obj']
#     num_array = info['num_array']
#     id_array = info['id_array']
#
#     stupyd = Interpreter(code_obj, num_array, id_array)
#     # stupyd.debug_code()


