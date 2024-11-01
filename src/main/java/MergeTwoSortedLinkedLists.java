public class MergeTwoSortedLinkedLists {

    //TODO Test6 fails: не справляется с дублирующимися значениями,
    // где-то в ветвлениях путаница с <=

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode result;
        if (list1.val <= list2.val) {
            result = list1;
        } else result = list2;

        ListNode tmp = new ListNode();
        while (list1.next != null && list2.next != null) {
            if (list1.val <= list2.val) {
                if (list2.val <= list1.next.val) {
                    tmp = list1.next;
                    list1.next = list2;
                    list1 = tmp;
                } else {
                    list1 = list1.next;
                }
            } else { // list2.val < list1.val
                if (list1.val < list2.next.val) {
                    tmp = list2.next;
                    list2.next = list1;
                    list2 = tmp;
                } else {
                    list2 = list2.next;
                }
            }
        }

        if (list1.next == null && list2.next == null) {
            if (list1.val <= list2.val) {
                tmp.next = list1;
                list1.next = list2;
            } else {
                tmp.next = list2;
                list2.next = list1;
            }
            return result;
        }

        ListNode single;
        ListNode plural;
        if (list1.next == null) {
            single = list1;
            plural = list2;
        } else {
            single = list2;
            plural = list1;
        }

        ListNode pluralPrev = new ListNode();
        while (single.val > plural.val && plural.next != null) {
            pluralPrev = plural;
            plural = plural.next;
        }

        if (single.val < plural.val) {
            pluralPrev.next = single;
            single.next = plural;
        } else {
            plural.next = single;
        }

        return result;

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode result = mergeTwoLists(list1, list2);
        System.out.println("\n\nTest 1 expected: \n1, 1, 2, 3, 4, 4");
        while (result != null) {
            System.out.print(result.val + ", ");
            result = result.next;
        }

        ListNode list3 = new ListNode(5);
        ListNode list4 = new ListNode(1, new ListNode(2, new ListNode(4)));

        ListNode result2 = mergeTwoLists(list3, list4);
        System.out.println("\n\nTest 2 expected: \n1, 2, 4, 5");
        while (result2 != null) {
            System.out.print(result2.val + ", ");
            result2 = result2.next;
        }

        ListNode test3List1 = new ListNode(-9, new ListNode(3));
        ListNode test3List2 = new ListNode(5, new ListNode(7));
        ListNode test3 = mergeTwoLists(test3List1, test3List2);
        System.out.println("\n\nTest 3 expected: \n-9, 3, 5, 7");
        while (test3 != null) {
            System.out.print(test3.val + ", ");
            test3 = test3.next;
        }

        ListNode test4List1 = new ListNode(-10, new ListNode(-10, new ListNode(-9,
                new ListNode(-4, new ListNode(1, new ListNode(6, new ListNode(6)))))));
        ListNode test4List2 = new ListNode(-7);
        ListNode test4 = mergeTwoLists(test4List1, test4List2);
        System.out.println("\n\nTest 4 expected: \n-10, -10, -9, -7, -4, 1, 6, 6,");
        while (test4 != null) {
            System.out.print(test4.val + ", ");
            test4 = test4.next;
        }

        ListNode test5List1 = new ListNode(-2, new ListNode(5));
        ListNode test5List2 = new ListNode(-9, new ListNode(-6,
                new ListNode(-3, new ListNode(-1, new ListNode(1, new ListNode(6))))));
        ListNode test5 = mergeTwoLists(test5List1, test5List2);
        System.out.println("\n\nTest 5 expected: \n-9, -6, -3, -2, -1, 1, 5, 6");
        while (test5 != null) {
            System.out.print(test5.val + ", ");
            test5 = test5.next;
        }

        ListNode test6List1 = new ListNode(-9, new ListNode(-7,
                new ListNode(-3, new ListNode(-3, new ListNode(-1,
                        new ListNode(2, new ListNode(3)))))));
        ListNode test6List2 = new ListNode(-7, new ListNode(-7,
                new ListNode(-6, new ListNode(-6, new ListNode(-5,
                        new ListNode(-3, new ListNode(2, new ListNode(4))))))));
        System.out.println("\n\nTest 6 expected: \n-9,-7,-7,-7,-6,-6,-5,-3,-3,-3,-1,2,2,3,4");
        ListNode test6 = mergeTwoLists(test6List1, test6List2);
        while (test6 != null) {
            System.out.print(test6.val + ",");
            test6 = test6.next;
        }

    }
}

/* Первая попытка не увенчалась успехом
ListNode resultHead = new ListNode();

        // Отработать нулевые значения
        if (list1 == null && list2 == null) {
            return resultHead;
        }
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Сформировать голову ответа
        if (list1.val > list2.val) {
            resultHead.val = list1.val;
            resultHead.next = list2;
            list1 = list1.next;
        } else {
            resultHead.val = list2.val;
            resultHead.next = list1;
            list2 = list2.next;
        }

        // Собрать остальное
        ListNode currentStep = resultHead;
        currentStep = currentStep.next;
        while (list1.next != null && list2.next != null) {
            if (list1.val == list2.val) {
                currentStep.val = list1.val;
                list1 = list1.next;
                currentStep = currentStep.next;
                currentStep.val = list2.val;
                list2 = list2.next;
            }
            if (list1.val > list2.val) {
                currentStep.val = list1.val;
                currentStep = currentStep.next;
                // Тут я поняла, что сегодня картинка в голове совсем не складывается
                // и надо поискать задачу попроще
            }
        }

        return resultHead;
 */