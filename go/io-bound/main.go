package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
    file, err := os.Open("data/example.md")
    if err != nil {
        fmt.Println(err)
        return
    }
    defer file.Close()

    scanner := bufio.NewScanner(file)
		
    for scanner.Scan() {
        fmt.Println(scanner.Text()) // Imprimir a linha lida
    }
}
