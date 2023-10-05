package main

import "fmt"

func quickSort(arr []int) []int {
	if len(arr) <= 1 {
		return arr
	}

	pivot := arr[0]
	var left, right []int

	for _, num := range arr[1:] {
		if num < pivot {
			left = append(left, num)
		} else {
			right = append(right, num)
		}
	}

	left = quickSort(left)
	right = quickSort(right)

	return append(append(left, pivot), right...)
}

func main() {
	arr := []int{83, 49, 22, 11, 67, 35, 88, 94, 38, 68, 75, 32, 70, 2, 14, 17, 96, 53, 5, 79,
		59, 90, 41, 71, 64, 87, 27, 8, 42, 60,
		1, 72, 76, 45, 63, 33, 99, 7, 51, 89,
		56, 26, 30, 93, 21, 15, 80, 58, 66, 24,
		18, 78, 61, 47, 85, 3, 73, 37, 29, 19,
		9, 92, 12, 55, 69, 36, 44, 81, 20, 46,
		25, 74, 31, 54, 77, 16, 86, 91, 6, 98,
		50, 10, 84, 4, 34, 28, 23, 95, 57, 65,
		43, 40, 62, 52, 48, 82, 97, 39}
	fmt.Println("Array original:", arr)
	sortedArr := quickSort(arr)
	fmt.Println("Array ordenado:", sortedArr)
}
