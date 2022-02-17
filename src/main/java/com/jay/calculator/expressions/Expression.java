package com.jay.calculator.expressions;

/**
 * @author Jay Yang
 * @date 2022/2/9
 */
public abstract class Expression {

    protected Expression prev;

    protected Expression next;

    public static void join(Expression node, Expression next) {
        if (node == null) {
            next.prev = null;
        } else if (next == null) {
            node.next = null;
        } else {
            node.next = next;
            next.prev = node;
        }
    }

    public static void disconnect(Expression node, Expression next) {
        if (node != null) {
            node.next = null;
        }
        if (next != null) {
            next.prev = null;
        }
    }

    public Expression next() {
        return next;
    }

    public Expression append(Expression next) {
        join(this, next);
        return next;
    }

    public static class VirtualHeadExpression extends Expression {

        public VirtualHeadExpression(Expression next) {
            join(this, next);
        }

        public VirtualHeadExpression() {
            this(null);
        }


        public Expression pop() {
            Expression head = next;
            disconnect(this, head);
            return head;
        }
    }

}
