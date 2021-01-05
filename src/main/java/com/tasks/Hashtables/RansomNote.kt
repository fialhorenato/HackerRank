package com.tasks.Hashtables

import kotlin.collections.ArrayList


fun checkMagazine(magazine: ArrayList<String>, note: ArrayList<String>) {
    val map = magazine.groupingBy { it }.eachCount().toMutableMap()
    note.forEach {
        if(!map.containsKey(it)) {
            print("No")
            return
        } else {
            if (map.get(it) == 0) {
                print("No")
                return
            }
            map.computeIfPresent(it) { _, v -> v - 1 }
        }
    }
    print("Yes")
}

fun main(args: Array<String>) {
    val magazine = arrayListOf("give", "me", "one", "grand", "today", "night");
    val note = arrayListOf("give", "one", "grand", "today");
    checkMagazine(magazine, note)
}