// estimateService.js
import axios from 'axios'

const API_URL = 'https://api.example.com' // 실제 API 엔드포인트를 사용하세요

export async function postEstimate(post: any) {
  try {
    console.log(post)
    return null
  } catch (error) {
    throw new Error('게시글을 등록하는 동안 오류가 발생했습니다.')
  }
}

// 다른 API 호출 함수들도 정의할 수 있음
