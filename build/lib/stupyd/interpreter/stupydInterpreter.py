class Interpreter:
    def __init__(self, code_obj, num_array, id_array):
        self.code_obj = code_obj
        self.num_array = num_array
        self.id_array = id_array
        self.stack = []
        self.environmrnt = {}

        self.instruction_set = {
            0: self.LOAD_NUM,
            1: self.DECL_FAST,
            2: self.STORE_FAST,
            3: self.LOAD_FAST,
            4: self.ADD_TWO_NUMBERS,
            5: self.SUBSTRACT_TWO_NUMBERS,
            6: self.MULTIPLE_TWO_NUMBERS,
            # 7 is initially reversed for division, now use it for print
            7: self.PRINT,
            8: self.COMPARE_TWO_NUMBERS,
            9: self.JUMP,
            10: self.JUMP_IF_FALSE,
            11: self.WHILE_LOOP,
            13: self.QUIT,

            # 14 - 16 is used

            17: self.LOAD_STRING
        }

        self.false_flag = 0
        self.pc = 0
        self.quit_flag = 0

    def readfile(self, code_obj):
        pass

    def print_running_env(self):
        print("running environment:")
        for key, value in self.environmrnt.items():
            print('\t{key}: {value}'.format(key=key, value=value))
        print('\n')

    # act like python dis.dis
    def dis(self):
        pass
        print("constant space: ", end='')
        print(self.num_array)
        print("variable space: ", end='')
        print(self.id_array)
        print()
        print('%-10s' %'index', end='')
        print('%-10s' %'ins_num', end='')
        print('%-10s' %'op_num', end='')
        print('%-20s' %'instruction', end='')
        print('%-10s' %'operator')
        for index in range(0, 2*len(self.code_obj), 2):
            instruction = self.code_obj[index]
            name = self.instruction_set[instruction[0]].__name__
            code = instruction[0]
            if code == 0:
                op = self.num_array[instruction[1]]
            elif code == 17:
                op = self.num_array[instruction[1]]
            elif code in [1, 2, 3]:
                op = self.id_array[instruction[1]]
            else:
                op = 'none'
            print('%-10s' %index, end='')
            print('%-10s' %instruction[0], end='')
            print('%-10s' %instruction[1], end='')
            print('%-20s' %name, end='')
            print('%-10s' %op)

    # push a number into stack
    def LOAD_NUM(self, index):
        self.stack.append(float(self.num_array[index]))

    # push a string into a stack
    def LOAD_STRING(self, index):
        self.stack.append(self.num_array[index])

    # create a new item in enviroment using id as key
    def DECL_FAST(self, index):
        if self.id_array[index] not in self.environmrnt:
            self.environmrnt[self.id_array[index]] = 0
        else:
            print('same variable has been declared!')

    # pop a value from stack and set as the value of id
    def STORE_FAST(self, index):
        val = self.stack.pop()
        if index != -1:
            self.environmrnt[self.id_array[index]] = val
        else:
            print('error: variable not declared!')

    # get value with id, then pop it into stack
    def LOAD_FAST(self, index):
        if index != -1:
            val = self.environmrnt[self.id_array[index]]
            self.stack.append(val)
        else:
            print('error: variable not declared!')

    # pop two values from stack, push sum back
    def ADD_TWO_NUMBERS(self, useless):
        val1 = self.stack.pop()
        val2 = self.stack.pop()
        val = val1 + val2
        self.stack.append(val)

    # pop two values from stack, push difference back
    def SUBSTRACT_TWO_NUMBERS(self, useless):
        val1 = self.stack.pop()
        val2 = self.stack.pop()
        val = val1 - val2
        self.stack.append(val)

    # pop two values from stack, push product back
    def MULTIPLE_TWO_NUMBERS(self, useless):
        val1 = self.stack.pop()
        val2 = self.stack.pop()
        val = val1 * val2
        self.stack.append(val)

    # pop an item then print it
    def PRINT(self, useless):
        val = self.stack.pop()
        print(val)

    # pop two items out to compare, then set flag
    def COMPARE_TWO_NUMBERS(self, case):
        val1 = self.stack.pop()
        val2 = self.stack.pop()
        if case == 0:
            if val1 <= val2:
                self.false_flag = 1
            else:
                self.false_flag = 0
        elif case == 1:
            if val1 >= val2:
                self.false_flag = 1
            else:
                self.false_flag = 0
        elif case == 2:
            if val1 == val2:
                self.false_flag = 0
            else:
                self.false_flag = 1
        else:
            pass

    # jump to target byte instruction
    def JUMP(self, target):
        self.pc = target

    # jump to target byte instruction depending on flag
    def JUMP_IF_FALSE(self, target):
        if self.false_flag == 1:
            self.pc = target

    # a flag for while_loop, doing nothing
    def WHILE_LOOP(self, useless):
        pass

    # quit the whole program, endding
    def QUIT(self, useless):
        self.quit_flag = 1



    # 增加pc的值 返回解析后的当前指令
    def dispatch(self):
        current_ins = self.code_obj[self.pc]
        self.pc = self.pc + 2
        return current_ins

    def execute_one_instruction(self):
        if self.quit_flag != 1:
            current_ins = self.dispatch()
            self.instruction_set[current_ins[0]](current_ins[1])
        else:
            return

    def run_code(self):
        while self.quit_flag != 1:
            current_ins = self.dispatch()
            self.instruction_set[current_ins[0]](current_ins[1])

    def debug_one_instruction(self):
        # dispatch one instruction
        current_ins = self.dispatch()

        # print current instruction
        print("current instruction: ")
        print('%-10s' % 'index', end='')
        print('%-10s' % 'ins_num', end='')
        print('%-10s' % 'op_num', end='')
        print('%-20s' % 'instruction', end='')
        print('%-10s' % 'operator')
        index = self.pc - 2
        name = self.instruction_set[current_ins[0]].__name__
        code = current_ins[0]
        if code == 0:
            op = self.num_array[current_ins[1]]
        elif code == 17:
            op = self.num_array[current_ins[1]]
        elif code in [1, 2, 3]:
            op = self.id_array[current_ins[1]]
        else:
            op = 'none'
        print('%-10s' % index, end='')
        print('%-10s' % current_ins[0], end='')
        print('%-10s' % current_ins[1], end='')
        print('%-20s' % name, end='')
        print('%-10s' % op)

        print('variables:', end='')
        print(self.environmrnt)

        print('data stack:', end='')
        print(self.stack)

        # execute it
        self.instruction_set[current_ins[0]](current_ins[1])


    # def debug_code(self):
    #     # print general information
    #     self.dis()
    #
    #     while self.quit_flag != 1:
    #         # dispatch one instruction
    #         current_ins = self.dispatch()
    #
    #         # print current instruction
    #         print()
    #         print("current instruction: ")
    #         print('%-10s' % 'index', end='')
    #         print('%-10s' % 'ins_num', end='')
    #         print('%-10s' % 'op_num', end='')
    #         print('%-20s' % 'instruction', end='')
    #         print('%-10s' % 'operator')
    #         index = self.pc - 2
    #         name = self.instruction_set[current_ins[0]].__name__
    #         code = current_ins[0]
    #         if code == 0:
    #             op = self.num_array[current_ins[1]]
    #         elif code == 17:
    #             op = self.num_array[current_ins[1]]
    #         elif code in [1, 2, 3]:
    #             op = self.id_array[current_ins[1]]
    #         else:
    #             op = 'none'
    #         print('%-10s' % index, end='')
    #         print('%-10s' % current_ins[0], end='')
    #         print('%-10s' % current_ins[1], end='')
    #         print('%-20s' % name, end='')
    #         print('%-10s' % op)
    #
    #         print('variables:', end='')
    #         print(self.environmrnt)
    #
    #         print('data stack:', end='')
    #         print(self.stack)
    #
    #         print('input \'n\' to execute current instruction: ', end='')
    #         next = input()
    #         if next == 'n':
    #             # execute current instruction
    #             self.instruction_set[current_ins[0]](current_ins[1])
    #             continue
    #         else:
    #             break




# demo = Interpreter(code_obj, num_array, id_array)
# demo.run_code()