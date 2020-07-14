cmake_minimum_required(VERSION 3.4.1)

add_subdirectory(x448)

add_library(
    core
    SHARED
    core.cpp
)

target_link_libraries(
    core
    x448
)

include_directories(
    x448/include
)
