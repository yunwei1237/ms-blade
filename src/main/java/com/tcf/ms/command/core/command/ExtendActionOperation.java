package com.tcf.ms.command.core.command;

import com.tcf.ms.command.core.base.var.Variable;

import java.util.function.Function;

public interface ExtendActionOperation extends ActionOperation {
    void fori(String destination, String lower, String upper, Function<Variable, ActionOperation> function);
    void fori(String destination, String lower, int upper, Function<Variable, ActionOperation> function);
    void fori(String destination, String lower, Variable upper, Function<Variable, ActionOperation> function);
    void fori(String destination, int lower, String upper, Function<Variable, ActionOperation> function);
    void fori(String destination, int lower, int upper, Function<Variable, ActionOperation> function);
    void fori(String destination, int lower, Variable upper, Function<Variable, ActionOperation> function);
    void fori(String destination, Variable lower, String upper, Function<Variable, ActionOperation> function);
    void fori(String destination, Variable lower, int upper, Function<Variable, ActionOperation> function);
    void fori(String destination, Variable lower, Variable upper, Function<Variable, ActionOperation> function);
    void fori(Variable destination, String lower, String upper, Function<Variable, ActionOperation> function);
    void fori(Variable destination, String lower, int upper, Function<Variable, ActionOperation> function);
    void fori(Variable destination, String lower, Variable upper, Function<Variable, ActionOperation> function);
    void fori(Variable destination, int lower, String upper, Function<Variable, ActionOperation> function);
    void fori(Variable destination, int lower, int upper, Function<Variable, ActionOperation> function);
    void fori(Variable destination, int lower, Variable upper, Function<Variable, ActionOperation> function);
    void fori(Variable destination, Variable lower, String upper, Function<Variable, ActionOperation> function);
    void fori(Variable destination, Variable lower, int upper, Function<Variable, ActionOperation> function);
    void fori(Variable destination, Variable lower, Variable upper, Function<Variable, ActionOperation> function);

    void foriReverse(String destination, String lower, String upper, Function<Variable, ActionOperation> function);
    void foriReverse(String destination, String lower, int upper, Function<Variable, ActionOperation> function);
    void foriReverse(String destination, String lower, Variable upper, Function<Variable, ActionOperation> function);
    void foriReverse(String destination, int lower, String upper, Function<Variable, ActionOperation> function);
    void foriReverse(String destination, int lower, int upper, Function<Variable, ActionOperation> function);
    void foriReverse(String destination, int lower, Variable upper, Function<Variable, ActionOperation> function);
    void foriReverse(String destination, Variable lower, String upper, Function<Variable, ActionOperation> function);
    void foriReverse(String destination, Variable lower, int upper, Function<Variable, ActionOperation> function);
    void foriReverse(String destination, Variable lower, Variable upper, Function<Variable, ActionOperation> function);
    void foriReverse(Variable destination, String lower, String upper, Function<Variable, ActionOperation> function);
    void foriReverse(Variable destination, String lower, int upper, Function<Variable, ActionOperation> function);
    void foriReverse(Variable destination, String lower, Variable upper, Function<Variable, ActionOperation> function);
    void foriReverse(Variable destination, int lower, String upper, Function<Variable, ActionOperation> function);
    void foriReverse(Variable destination, int lower, int upper, Function<Variable, ActionOperation> function);
    void foriReverse(Variable destination, int lower, Variable upper, Function<Variable, ActionOperation> function);
    void foriReverse(Variable destination, Variable lower, String upper, Function<Variable, ActionOperation> function);
    void foriReverse(Variable destination, Variable lower, int upper, Function<Variable, ActionOperation> function);
    void foriReverse(Variable destination, Variable lower, Variable upper, Function<Variable, ActionOperation> function);
}
