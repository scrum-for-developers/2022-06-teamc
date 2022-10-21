Feature: Adding a new book to the library

    Scenario Outline: Adding various books

        Given an empty library

        When a librarian adds a random book and the "<property>" of that book is "<value>"

        Then the booklist shows that book with "<property>" as "<value>"

        Examples:
            | property | value           |
            | title    | Sourcery        |
            | author   | Terry Pratchett |
            | year     | 1989            |
            | isbn     | 3740814470      |
            | isbn     | 9783740814472   |

    Scenario: Adding books with special characters

      Given an empty library

      When a librarian adds a random book and the "title" of that book is "  X  "

      Then the booklist shows that book with "title" as "  X  "


    Scenario Outline: There can be multiple copies of the same book with the same ISBN

        Given an empty library

        When a librarian adds a book with "<title>", "<author>", <edition>, "<year>" and "<isbn>"
        And a librarian adds another book with "<title2>", "<author2>", <edition2>, "<year>" and "<isbn>"

        Then the booklist contains a book with "<title>", "<author>", "<year>", <edition> and "<isbn>"
        And the library contains <nr> copies of the book with "<isbn>"

        Examples:

            | title    | author          | edition | year | isbn       | title2                | author2                |edition2 | nr |
            | Sourcery | Terry Pratchett | 1       | 1989 | 0552131075 | Sourcery              | Terry Pratchett        |       1 | 2  |
            | Sourcery | Terry Pratchett | 1       | 1989 | 0552131075 | Sourcery              | XX_DIFFERENT_AUTHOR_XX | 1       | 1  |
            | Sourcery | Terry Pratchett | 1       | 1989 | 0552131075 | XX_DIFFERENT_TITLE_XX | Terry Pratchett        | 1       | 1  |
            | Sourcery | Terry Pratchett | 1       | 1989 | 0552131075 | Sourcery              | Terry Pratchett        | 666     | 1  |







