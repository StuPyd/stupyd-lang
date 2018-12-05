import sys
from antlr4 import *
from stuPydLexer import stuPydLexer
from stuPydParser import stuPydParser
from extendListener import extendListener

def mainfunc():
    instream = FileStream('test_1.sp')
    # print("instream")
    lexer = stuPydLexer(instream)
    token_stream = CommonTokenStream(lexer)
    # print (token_stream.getText())
    parser = stuPydParser(token_stream)
    # print(parser.getInputStream())
    tree = parser.file_input()
    # print(tree)
    walker = ParseTreeWalker()
    # print(tree.toStringTree(recog=parser))
    lsn = extendListener()
    walker.walk(lsn,tree)
    print()

mainfunc()