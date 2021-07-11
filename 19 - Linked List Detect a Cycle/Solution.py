"""
Detect a cycle in a linked list. Note that the head pointer may be 'None' if the list is empty.

A Node is defined as: 
 
    class Node(object):
        def __init__(self, data = None, next_node = None):
            self.data = data
            self.next = next_node
"""


def has_cycle(head):
    if head is None:
        return False

    node_counter_map = {}
    current = head

    while current is not None:
        if not node_counter_map or current not in node_counter_map:
            node_counter_map[current] = 0
            continue

        counter = node_counter_map[current]

        if counter > 1:
            return True

        node_counter_map[current] += 1
        current = current.next
