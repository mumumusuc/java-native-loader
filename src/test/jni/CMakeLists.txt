cmake_minimum_required(VERSION 3.10)
project(test)

set(TARGET      test)
set(SRCS        com_mumumusuc_loader_NativeLoaderTest.cxx)

find_package(JNI REQUIRED)
include_directories(${JNI_INCLUDE_DIRS})

add_library(${TARGET} SHARED ${SRCS})