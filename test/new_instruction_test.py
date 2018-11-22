import sys
sys.path.append("..")
from stupyd.interpreter.stupydInterpreter import Interpreter
from stupyd.interpreter.stupydShell import stupydShell

class test_runner:
    def __init__(self, code_obj, num_array, id_array):
            self.code_obj = code_obj
            self.num_array = num_array
            self.id_array = id_array
    def run(self):
        stupyd = Interpreter(self.code_obj, self.num_array, self.id_array)
        stupyd.run_code()

'''
design your test instance here

source code:
    num[3] a
    1 -> a[0]
    2 -> a[1]
    3 -> a[2]
    print(a[1])
    print(a)

id_array: a, a, a, a, a, a
num_array: 0, 3, 1, 0, 2, 1, 3, 2, 1
code_obj:
    DECL_FAST(0) a
    LOAD_NUM(0) 0
    LOAD_NUM(0) 0
    LOAD_NUM(0) 0
    BUILD_ARRAY(1) 3
    STORE_FAST(0) a
    
    LOAD_NUM(2) 1
    LOAD_FAST(1) a
    STORE_SUBSCR(3) 0
    STORE_FAST(1) a
    
    LOAD_NUM(4) 2
    LOAD_FAST(2) a
    STORE_SUBSCR(5) 1
    STORE_FAST(2) a
    
    LOAD_NUM(6) 3
    LOAD_FAST(3) a
    STORE_SUBSCR(7) 2
    STORE_FAST(3) a
    
    LOAD_FAST(4) a
    LOAD_SUBSCR(8) 1
    PRINT(-1)
    
    LOAD_FAST(5) a
    PRINT(-1)
    
    QUIT(-1)

'''

def main():
    num_array = [0, 3, 1, 0, 2, 1, 3, 2, 1]
    id_array = ['a', 'a', 'a', 'a', 'a', 'a']
    code_obj = {
        0: [1, 0],
        2: [0, 0],
        4: [0, 0],
        6: [0, 0],
        8: [18, 1],
        10: [2, 0],

        12: [0, 2],
        14: [3, 1],
        16: [20, 3],
        18: [2, 1],

        20: [0, 4],
        22: [3, 2],
        24: [20, 5],
        26: [2, 2],

        28: [0, 6],
        30: [3, 3],
        32: [20, 7],
        34: [2, 3],

        36: [3, 4],
        38: [19, 8],
        40: [7, -1],

        42: [3, 5],
        44: [7, -1],

        46: [13, -1],
    }
    stupyd = Interpreter(code_obj, num_array, id_array)
    shell = stupydShell(stupyd)
    shell.cmdloop()

main()